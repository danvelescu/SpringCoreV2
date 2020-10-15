package models;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Artist artist;

  public MusicPlayer(Artist artist){
      this.artist = artist;
  }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void play() {
        System.out.println("Play " + artist.getName() + " " + artist.getName_of_song() + " " + artist.getMusicType().getMusic_type_name());
    }
}
