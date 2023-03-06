package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {

    private final List<String> songList = new ArrayList<String>() {{
        add("Hungarian Rhapsody");
        add("Moonlight Sonata");
        add("Swan Lake");
    }};
    @Override
    public List<String> getSong() {
        return songList;
    }
}
