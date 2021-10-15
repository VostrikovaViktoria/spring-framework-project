package org.spring.learnProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
