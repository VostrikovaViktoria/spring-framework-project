package aop;

import aop.aspects.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
