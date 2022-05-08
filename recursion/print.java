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
    public static int linearpow(int x,int a){
        if (a==0){
            return 1;
        }
        return x*linearpow(x,a-1);
    }
    public static int logppow(int x , int a){
        if (a==1){
            return x;
        }

        int ans = 2*logppow(x,a/2);
        if (a%2!=0){
            ans=ans*x;
        }
        return ans;
    }
    public static void toh(int n,char s,char d,char h){
        if (n==1){
            System.out.println(n+"["+s+"->"+d+"]");
            return;
        }
        toh(n-1,s,h,d);
        System.out.println(n+"["+s+"->"+d+"]");
        toh(n-1,h,d,s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x=2;
        int n=3;
        decrease(a);
        increase(a);
        System.out.println();
        incdec(a);
        System.out.println(fact(a));
        System.out.println(linearpow(x,a));
        System.out.println(logppow(x,a));
        toh(n,'a','b','c');
    }

}
