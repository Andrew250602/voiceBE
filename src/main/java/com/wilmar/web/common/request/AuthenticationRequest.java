package com.wilmar.web.common.request;

import com.wilmar.web.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationRequest extends BaseEntity {
    private String username;
    private String password;
}
