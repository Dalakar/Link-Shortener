package dev.greencashew.linkshortener.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public record CreateLinkDto (
        @Schema(description = "Identifier/alias to link. Used for redirection.",
                example = "link-alias", required = true)

        String id,
    String email,
    String targetUrl,
    LocalDate expirationDate){

    LinkDto toDto(){
        return new LinkDto(id, email, targetUrl, expirationDate, 0);
        }

    }

