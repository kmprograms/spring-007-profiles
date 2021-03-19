package com.app.config;

import com.app.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Profile("prod")
@PropertySource("classpath:application-prod.properties")
@RequiredArgsConstructor
public class ProdSpringConfig {
    private final Environment environment;

    @Bean
    public Message message() {
        return Message
                .builder()
                .title(environment.getProperty("message.title"))
                .text(environment.getProperty("message.text"))
                .build();
    }
}
