package com.example.linkspringandflutter.common.exception;

import com.example.linkspringandflutter.common.response.ErrorMessage;
import lombok.Getter;

@Getter
public class TokenForbiddenException extends BaseException {
    public TokenForbiddenException(ErrorMessage error) {
        super(error, "[TokenForbiddenException] " + error.getMessage());
    }
}
