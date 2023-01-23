package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;
import java.util.*;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(((b*b)-(4*a*c))<0){
            System.out.println("no roots");
        }
        else if(((b*b)-(4*a*c))==0){
            System.out.println((-b)/(2*a));
        }
        else{
            System.out.print(((-b)-sqrt((b*b)-(4*a*c)))/(2*a)+" ");
            System.out.println(((-b)+sqrt((b*b)-(4*a*c)))/(2*a));
        }

    }

}