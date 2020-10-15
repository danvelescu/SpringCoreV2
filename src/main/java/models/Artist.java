package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Artist {
    private String name;
    private MusicType musicType;
    private String name_of_song;

    @Autowired
    public Artist(MusicType musicType){
        this.name = "Skrip";
        this.musicType = musicType;
        name_of_song = "3x3";
    }

    public void setMusicType(MusicType musicType) {
        this.musicType = musicType;
    }

    public void setName_of_song(String name_of_song) {
        this.name_of_song = name_of_song;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MusicType getMusicType() {
        return musicType;
    }

    public String getName_of_song() {
        return name_of_song;
    }
}
