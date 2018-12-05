package net.psv73.sptest;

import net.psv73.sptest.impl.BestFM;
import net.psv73.sptest.interfaces.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Config2 {

    @Bean
    public Radio getRadio() {
        return new BestFM();
    }

}
