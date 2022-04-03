package dev.greencashew.linkshortener.controller;

import dev.greencashew.linkshortener.link.ExceptionResponse;
import dev.greencashew.linkshortener.link.LinkAlreadyExistsException;
import dev.greencashew.linkshortener.link.LinkDto;
import dev.greencashew.linkshortener.link.LinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/links")
public class LinkManageController {

    private LinkService service;

    public LinkManageController(LinkService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> createLink(@RequestBody CreateLinkDto link){
        try {
            LinkDto linkDto = link.toDto();
            return ResponseEntity.
                    created(URI.create(linkDto.getShortenedLink())).
                    body(service.createLink(linkDto));
        } catch (LinkAlreadyExistsException e) {
            e.printStackTrace();
            return ResponseEntity.
                    status(HttpStatus.CONFLICT).
                    body(new ExceptionResponse(e.getMessage()));
        }

    }

}
