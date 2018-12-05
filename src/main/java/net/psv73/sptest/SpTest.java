package net.psv73.sptest;

import net.psv73.sptest.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().addActiveProfile("dev");
        context.register(Conf.class);
        context.refresh();
        Car toyota = context.getBean(Car.class);
        toyota.drive();
    }
}
