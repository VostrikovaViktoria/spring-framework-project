package org.spring.learnProject;

public class Singer {
    public String name;
    private Music music;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println(name + " - " + music.playMusic());
    }
}
