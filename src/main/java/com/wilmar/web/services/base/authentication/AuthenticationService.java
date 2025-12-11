package com.wilmar.web.services.base.authentication;


import com.wilmar.web.common.request.AuthenticationRequest;
import com.wilmar.web.common.response.AuthenticationResponse;
import org.springframework.http.ResponseEntity;

public interface AuthenticationService {

    ResponseEntity<AuthenticationResponse> create(AuthenticationRequest authorReq);
}
