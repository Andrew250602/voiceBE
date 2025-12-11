package com.wilmar.web.services.impl.authentication;

import com.wilmar.web.common.request.AuthenticationRequest;
import com.wilmar.web.common.response.AuthenticationResponse;
import com.wilmar.web.entity.authentication.Authentication;
import com.wilmar.web.repository.authentication.AuthenticationRepository;
import com.wilmar.web.services.base.authentication.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationRepository authenticationRepository;

    public AuthenticationServiceImpl(AuthenticationRepository authenticationRepository) {
        this.authenticationRepository = authenticationRepository;
    }


    @Override
    public ResponseEntity<AuthenticationResponse> create(AuthenticationRequest authorReq) {

        createUser(authorReq);

        return ResponseEntity.ok(new AuthenticationResponse("success", "token" ));
    }

    private void createUser(AuthenticationRequest authorReq) {
        List<Authentication> author = authenticationRepository.findAuthorByUsername(verifyString(authorReq.getUsername()));
        if (author.isEmpty()) {
            Authentication auth = new Authentication();
            auth.setUsername(authorReq.getUsername());

            saveEntity(auth);
        }

    }

    private void saveEntity(Authentication auth) {
        authenticationRepository.save(auth);
    }


    private String verifyString(String value) {
        if (value == null) {
            return null;
        }
        return value.replaceAll("[^a-zA-Z0-9\\s]", "");
    }

}
