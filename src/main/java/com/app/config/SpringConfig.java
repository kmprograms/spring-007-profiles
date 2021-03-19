package com.app.config;

import com.app.config.type.ProfileType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan("com.app")
public class SpringConfig {
    public static AbstractApplicationContext createContext(ProfileType profileType) {
        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profileType.toString());
        context.register(SpringConfig.class);
        context.refresh();
        return context;
    }
}
