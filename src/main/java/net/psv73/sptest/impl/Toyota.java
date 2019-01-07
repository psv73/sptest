package net.psv73.sptest.impl;

import net.psv73.sptest.MyCondition;
import net.psv73.sptest.interfaces.Car;
import net.psv73.sptest.interfaces.Radio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@Profile("dev")
@Conditional(MyCondition.class)
@PropertySource("classpath:my.properties")
public class Toyota implements Car {

    @Autowired
    Radio radio;

    @Value("${name}")
    String nameOwner;

    @Override
    public void drive() {
        radio.listenMusic();
        System.out.println("Driving toyota..." + nameOwner);
    }
}
