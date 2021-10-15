package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentLogAdvice(){
        System.out.println("beforeGetStudentLogAdvice: логгирование получение " +
                "списка студентов до работы метода");
    }

    @After("execution(* getStudents())")
    public void afterAdvice(){
        System.out.println("afterAdvice: логируем нормальное окончание работы" +
                " или ловим исключение");
    }

//    @AfterThrowing(pointcut = "execution(* getStudents())"
//            ,throwing = "exception")
//    public void afterThrowingAdvice(Throwable exception){
//
//        System.out.println("afterThrowingAdvice: логируем выброс исключения "
//        + exception);
//
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())"
//    , returning = "students")
//    public void afterReturnStudentLogAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String name = firstStudent.getNameSurname();
//        name = "Ms. " + name;
//        firstStudent.setNameSurname(name);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade++;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturnStudentLogAdvice: логгирование получение " +
//                "списка студентов после работы метода");
//    }
}
