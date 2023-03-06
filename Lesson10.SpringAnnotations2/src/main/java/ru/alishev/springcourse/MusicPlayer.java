package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(MusicGenre musicGenre) {
        List<String> songList;
        switch (musicGenre) {
            case CLASSICAL:
                songList = classicalMusic.getSong();
                break;
            case ROCK:
                songList = rockMusic.getSong();
                break;
            default:
                songList = new ArrayList<>();
        }
        Random random = new Random();
        int index = random.ints(0, Math.max(0, songList.size() - 1)).findFirst().getAsInt();
        return "Playing: " + songList.get(index);
    }
}
