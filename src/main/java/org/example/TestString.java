package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestString {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        PlayerMusic playerMusic = context.getBean("playerMusic", PlayerMusic.class);

        playerMusic.playMusic();


        context.close();
    }
}
