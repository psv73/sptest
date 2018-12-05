package net.psv73.sptest.impl;

import net.psv73.sptest.interfaces.Radio;
import org.springframework.stereotype.Component;

@Component
public class BestFM implements Radio {
    @Override
    public void listenMusic() {
        System.out.println("Music is playing...");
    }
}
