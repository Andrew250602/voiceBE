package com.wilmar.web.repository.authentication;


import com.wilmar.web.entity.authentication.Authentication;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface AuthenticationRepository extends MongoRepository<Authentication, String> {

    List<Authentication> findAuthorByUsername(String value);
    // ví dụ:
}
