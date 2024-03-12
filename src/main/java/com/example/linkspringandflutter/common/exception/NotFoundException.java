package com.example.linkspringandflutter.common.exception;

import com.example.linkspringandflutter.common.response.ErrorMessage;
import lombok.Getter;

@Getter
public class NotFoundException extends BaseException {
    public NotFoundException(ErrorMessage error) {
        super(error, "[NotFoundException] " + error.getMessage());
    }
}