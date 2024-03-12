package com.example.linkspringandflutter.common.exception;

import com.example.linkspringandflutter.common.response.ErrorMessage;
import lombok.Getter;

@Getter
public class UserConflictException extends BaseException {
    public UserConflictException(ErrorMessage error) {
        super(error, "[UserConflictException] " + error.getMessage());
    }
}
