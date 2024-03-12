package com.example.linkspringandflutter.common.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessMessage {
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusValue(){
        return httpStatus.value();
    }

}
