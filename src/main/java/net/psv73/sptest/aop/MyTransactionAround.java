package net.psv73.sptest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class MyTransactionAround {

    @Around("execution(* net.psv73.sptest.aop.MyUserRepo.getInfo())")
    public void aroundTransaction(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("begin transaction");
            joinPoint.proceed();
            System.out.println("end");
        } catch (Throwable throwable) {
            System.out.println("rollback transaction");
        } finally {
            System.out.println("commit transaction");
        }
    }
}
