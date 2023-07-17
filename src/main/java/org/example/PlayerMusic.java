package org.example;

public class PlayerMusic {
    private Music music;

    public void setMusic(Music music){

        this.music = music;

    }

    public void playMusic(){
        System.out.println("Play "+ music.getSoun());
    }

}
