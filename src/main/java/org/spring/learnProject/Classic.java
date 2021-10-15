package org.spring.learnProject;

public class Classic implements Music {
    private String name_song;


    public void setName_song(String name_song) {
        this.name_song = name_song;
    }

    public String getName_song() {
        return name_song;
    }

    public String playMusic(){
        return name_song + " is playing now.";
    }
}
