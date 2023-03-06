package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {

    private final List<String> songList = new ArrayList<String>() {{
        add("Wind cries Mary");
        add("Smoke on the water");
        add("Highway to hell");
    }};
    @Override
    public List<String> getSong() {
        return songList;
    }
}
