package com.example.linkspringandflutter.common.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorMessage {
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusValue() {
        return httpStatus.value();
    }

}
