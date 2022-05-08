package com.company.coding2.recursion;
import java.util.*;

public class print {

    public static void decrease(int a){
        if (a==-1)
            return;
        System.out.println(a);
        decrease(a-1);
    }
    public static void increase(int a){
        if (a==-1)
            return;
        increase(a-1);
        System.out.println(a);
    }
    public static void incdec(int a){
        if (a==-1)
            return;

        System.out.println(a);
        incdec(a-1);
        System.out.println(a);
    }

    public static int fact(int a){
        if (a==0)
           return 1;
        if (a==1)
            return 1;

        int f = a*fact(a-1);
        return f;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        decrease(a);
        increase(a);
        System.out.println();
        incdec(a);
        System.out.println(fact(a));
    }

}
