package com.example.linkspringandflutter.common.exception;

import com.example.linkspringandflutter.common.response.ErrorMessage;
import lombok.Getter;

@Getter
public class BadRequestException extends BaseException {
    public BadRequestException(ErrorMessage error) {
        super(error, "[BadRequestException] " + error.getMessage());
    }
}
