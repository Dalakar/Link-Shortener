package dev.greencashew.linkshortener.controller;

import io.swagger.v3.oas.annotations.media.Schema;

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

    //	@RequestMapping
//	@GetMapping
//	public void redirectLink(
//			@PathVariable String id, HttpServletResponse httpServletResponse) throws IOException {
//		httpServletResponse.sendRedirect("https://github.com/greencashew/warsztaty-podstawy-springa");}

    }

