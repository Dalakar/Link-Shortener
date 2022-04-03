package dev.greencashew.linkshortener.controller;

import java.time.LocalDate;

public record LinkDto(String id, String email, String targetUrl, LocalDate expirationDate, int liczba){

//    LinkDto toDto(){
//        return new LinkDto(id, email, targetUrl, expirationDate, 0);
//    }


}



