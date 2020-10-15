package config;

import models.Artist;
import models.MusicPlayer;
import models.MusicType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    MusicPlayer getMusicPlayer(){
        MusicPlayer mp = new MusicPlayer();
        mp.setArtist(getArtist());
        return mp;
    }
    @Bean
    Artist getArtist(){
        Artist artist = new Artist();
        artist.setName("Skriptonit");
        artist.setMusicType(getMusicType());
        artist.setName_of_song("3x3");
        return artist;
    }
    @Bean
    MusicType getMusicType(){
        MusicType musicType = new MusicType();
        musicType.setMusic_type("Pop");
        return musicType;
    }
}
