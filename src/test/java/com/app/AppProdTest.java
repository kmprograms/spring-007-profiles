package com.app;

import com.app.config.SpringConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { SpringConfig.class })
@ActiveProfiles("prod")
public class AppProdTest {
    @Autowired
    private Environment environment;

    @Test
    public void test1() {
        var personName = environment.getRequiredProperty("person.name");
        var personAge = environment.getRequiredProperty("person.age", Integer.class);
        Assertions.assertThat(personName).isEqualTo("PROD PERSON NAME");
        Assertions.assertThat(personAge).isEqualTo(20);
    }
}