package com.olsh.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by pc on 24.04.2016.
 */
@Component
public class SgtPeppers implements CompactDisk {
    private  String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
