package net.psv73.sptest.apo;

import org.springframework.stereotype.Component;

@Component
public class MyUserRepo implements MyRepo {
    @Override
    public void getInfo() {
        System.out.println("name Sergey");
    }
}
