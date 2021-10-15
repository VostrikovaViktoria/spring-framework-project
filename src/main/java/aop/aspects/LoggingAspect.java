package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodAdvice(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazine(){}
//
//    @Pointcut("allMethodAdvice() && !returnMagazine()")
//    private void allMethodExceptionReturnMagazine(){}
//
//    @Before("allMethodExceptionReturnMagazine()")
//    private void beforeAllMethodExceptionReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodExceptionReturnMagazineAdvice");
//    }
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary(){}
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary(){}
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint ){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature" + methodSignature);
        System.out.println("methodSignature.getMethod()" + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType()" + methodSignature.getReturnType());
        System.out.println("methodSignature.getName()" + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for (Object obj: args){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " +
                            myBook.getName() + " автор - " + myBook.getAuthor()
                    + " год - " + myBook.getYear());

                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет "+ obj);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: Попытка получить книгу/журнал");
        System.out.println("------------------------------- ");
    }



}
