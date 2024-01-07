package org.example.project8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = context.getBean("catBean", Cat.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
