package com.wilmar.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import java.util.Optional;

@Configuration
@EnableMongoAuditing
//Auditing (@CreatedBy, @CreatedDate, @LastModifiedBy, @LastModifiedDate)  only activate at this moment
public class MongoConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        // Trả về username hiện tại. Ví dụ lấy từ SecurityContextHolder.
        return () -> Optional.ofNullable(getCurrentUsername()).or(() -> Optional.of("system"));
    }

    private String getCurrentUsername() {
        // TODO: lấy từ Spring Security nếu có
        return null;
    }
}

