package dev.greencashew.linkshortener.link;

public interface LinkService {
    LinkDto createLink(LinkDto Dto) throws LinkAlreadyExistsException;

    LinkDto getLink(String id);
}
