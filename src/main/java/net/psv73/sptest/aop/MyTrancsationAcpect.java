package net.psv73.sptest.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyTrancsationAcpect {

    @Pointcut("execution(* net.psv73.sptest.aop.MyUserRepo.withParams(String)) && args(name)")
    public void paramPointcut(String name) {}

    @Before(value = "paramPointcut(name)")
    public void beforMethodWithParam(String name) {
        System.out.println("you entered as " + name);
    }

    @Pointcut("execution(* net.psv73.sptest.aop.MyUserRepo.getInfo())")
    public void myPointcut() {}

    @Before("myPointcut()")
    public void beginTrancsaction() {
        System.out.println("begin transaction");
    }

    @After("myPointcut()")
    public void after() {
        System.out.println("after method");
    }

    @AfterReturning("myPointcut()")
    public void commitTransaction() {
        System.out.println("commit transaction");
    }

    @AfterThrowing("myPointcut()")
    public void rollback() {
        System.out.println("rollback transaction");
    }
}
