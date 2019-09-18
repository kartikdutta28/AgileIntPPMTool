package io.agileintelligence.ppmtool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class UsernameAlreadyExistsExceptionResponse  {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UsernameAlreadyExistsExceptionResponse(String username) {
        this.username=username;
    }
}
