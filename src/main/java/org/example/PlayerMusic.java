package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PlayerMusic {

    private Music music;

    @Autowired
    public void setMusic(Music music) {

        this.music = music;

    }

    public void playMusic(){
        System.out.println("Play "+ music.getSoun());
    }

}
