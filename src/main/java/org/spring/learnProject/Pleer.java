package org.spring.learnProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pleer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Singer singer = context.getBean("mySinger", Singer.class);
        singer.playMusic();
    }
}
