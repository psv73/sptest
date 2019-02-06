package net.psv73.sptest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewAspect {

    @Before("execution(* net.psv73.sptest.aop.MyUserRepo.getInfo())")
    public void beforNew() {
        System.out.println("new befor");
    }
}
