package net.psv73.sptest.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("myUserRepo")
@PropertySource("classpath:my.properties")
public class MyUserRepo implements MyRepo {

    @Value("${name}")
    String nameOwner;

    @Override
    public void getInfo() {
        System.out.println("name " + nameOwner);
    }

    @Override
    public void withParams(String name) {
        getInfo();
        System.out.println(name);
    }
}
