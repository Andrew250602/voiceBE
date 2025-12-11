package com.wilmar.web.controller.Authentication;

import com.wilmar.web.common.request.AuthenticationRequest;
import com.wilmar.web.common.response.AuthenticationResponse;
import com.wilmar.web.services.base.authentication.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class AuthenticationController {
    AuthenticationService authenticationService;
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/")
    public ResponseEntity<String> login(@RequestBody AuthenticationRequest authorReq){
        return null;
    }

    @PostMapping("/create")
    public ResponseEntity<AuthenticationResponse> create(@RequestBody AuthenticationRequest authorReq){
        return authenticationService.create(authorReq);
    }



}
