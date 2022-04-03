package dev.greencashew.linkshortener.link;

public class LinkAlreadyExistsException extends Exception {

    public LinkAlreadyExistsException(String id){
        super("Link o id " + id + " already exist.");
    }

}
