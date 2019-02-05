package net.psv73.sptest;

import net.psv73.sptest.apo.MyRepo;
import net.psv73.sptest.interfaces.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpTest {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().addActiveProfile("dev");
//        context.register(Conf.class);
//        context.refresh();
//        Car toyota = context.getBean(Car.class);
//        toyota.drive();
        ApplicationContext context = new AnnotationConfigApplicationContext(net.psv73.sptest.apo.MyConf.class);
        MyRepo bean = context.getBean(MyRepo.class);
        bean.getInfo();

    }
}
