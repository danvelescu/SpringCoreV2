package config;

import models.Artist;
import models.MusicPlayer;
import models.MusicType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "models")
public class SpringConfig {
    @Bean
    MusicType getMusicType(){
        MusicType musicType = new MusicType();
        musicType.setMusic_type("Pop");
        return musicType;
    }
    @Bean
    Artist getArtist(){
        return new Artist(getMusicType());
    }
}
