package net.psv73.sptest;

import net.psv73.sptest.interfaces.Car;
import net.psv73.sptest.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class Mitsubishi implements Car {

    @Autowired
    Radio radio;

    @Override
    public void drive() {
        radio.listenMusic();
        System.out.println("Driving mitsubishi...");
    }
}
