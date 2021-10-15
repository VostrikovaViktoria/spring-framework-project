package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: в библиотеку пытаются вернуть книгу");

        Object targetMethodRes = null;
        try{
            targetMethodRes = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.out.println("aroundReturnBookAdvice: было поймано исключение " + e);
            throw e;
        }

        System.out.println("aroundReturnBookAdvice: в библиотеку успешно вернули книгу");

        return targetMethodRes;
    }
}
