package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Artist artist;

    @Autowired
    public MusicPlayer(Artist artist) {
        this.artist = artist;
    }

    public void play() {
        System.out.println("Play " + artist.getName() + " " + artist.getName_of_song() + " " + artist.getMusicType().music);
    }
}
