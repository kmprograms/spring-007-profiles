package com.app.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@EqualsAndHashCode
@ToString
public class Person {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;
}
