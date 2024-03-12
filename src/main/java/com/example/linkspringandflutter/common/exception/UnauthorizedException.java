package com.example.linkspringandflutter.common.exception;

import com.example.linkspringandflutter.common.response.ErrorMessage;
import lombok.Getter;

@Getter
public class UnauthorizedException extends BaseException {
    public UnauthorizedException(ErrorMessage error) {
        super(error, "[UnauthorizedException] " + error.getMessage());
    }
}
