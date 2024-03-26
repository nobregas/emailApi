package org.gabnob.emailapi.dtos;

public record EmailDto(
        String to, String subject, String body
) {
}
