package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("popmusic")
public class PopMusic implements Music {
    private MusicType musicType;

    @Autowired
    PopMusic(MusicType mp){
        this.musicType = mp;
    }


    public MusicType getMusic() {
        return this.musicType;
    }

    @Override
    public String toString() {
        return "Pop Music";
    }
}
