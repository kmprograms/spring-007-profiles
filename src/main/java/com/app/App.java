package com.app;

import com.app.config.SpringConfig;
import com.app.config.type.ProfileType;
import com.app.model.Message;
import com.app.model.Person;

public class App {
    public static void main(String[] args) {
        System.out.println("---------------------------------- 1 ---------------------------------");
        var devContext = SpringConfig.createContext(ProfileType.DEV);
        var message = devContext.getBean("message", Message.class);
        var person = devContext.getBean("person", Person.class);
        System.out.println(message);
        System.out.println(person);

        System.out.println("---------------------------------- 2 ---------------------------------");
        var prodContext = SpringConfig.createContext(ProfileType.PROD);
        var message2 = prodContext.getBean("message", Message.class);
        var person2 = prodContext.getBean("person", Person.class);
        System.out.println(message2);
        System.out.println(person2);
    }
}
