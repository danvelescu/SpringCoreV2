package models;

import org.springframework.stereotype.Component;

@Component("classicmusic")
public class ClassicMusic implements Music{
    MusicType musicType;
    public ClassicMusic(MusicType musicType){
        this.musicType = musicType;
    }

    public MusicType getMusic() {
        return this.musicType;
    }

    @Override
    public String toString() {
        return "Classic Music";
    }
}
