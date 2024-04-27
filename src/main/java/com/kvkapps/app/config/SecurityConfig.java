package com.kvkapps.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@Configuration
public class SecurityConfig {

    final static String[] PUBLIC_PATHS = {
            "/",
            "/h2-console/**",
            "/swagger-ui/**",
            "/v3/**",
            "/api-docs/**"
    };

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers(PUBLIC_PATHS);
    }
}
