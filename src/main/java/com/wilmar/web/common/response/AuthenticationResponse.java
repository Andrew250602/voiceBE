package com.wilmar.web.common.response;

import com.wilmar.web.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationResponse extends BaseEntity {
    private String username;
    private String token;
    // Constructor
    public AuthenticationResponse(String username, String token) {
        this.username = username;
        this.token = token;
    }
}
