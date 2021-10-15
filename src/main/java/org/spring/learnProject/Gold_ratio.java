package org.spring.learnProject;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Gold_ratio {
    public static double my_func(double x){
        return 2 * pow(x,3) + 15 * x * x + 24 * x - 5;
    }

    public static double X1(double a, double b){
        return a + 0.38 * (b - a);
    }
    public static double X2(double a, double b){
        return b - 0.38 * (b - a);
    }

    public static void main(String[] args) {

        double e = 0.01;
        double a = - 3.5;
        double b = 5;

        double x1 = X1(a, b);
        double x2 = X2(a, b);

        double f1 = my_func(x1);
        double f2 = my_func(x2);
        int n = 0;
        while (abs(b - a) > e){
            if (f1 < f2){
                b = x2;
                x2 = X2(a, b);
                f2 = my_func(x2);
            }
            else{
                a = x1;
                x1 = X1(a, b);
                f2 = my_func(x2) ;
            }
        }
        double min_x = (b + a) / 2;
        double min_f = my_func(min_x);
        System.out.println(min_x + " - " + min_f);


    }
}
