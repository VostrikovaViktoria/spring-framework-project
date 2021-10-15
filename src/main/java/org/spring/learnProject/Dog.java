package org.spring.learnProject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Dog implements Pet {

    public Dog(){
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    public void init(){
         System.out.println("Class Dog: init");
    }
    public void destroy(){
        System.out.println("Class Dog: destroy");
    }
}
