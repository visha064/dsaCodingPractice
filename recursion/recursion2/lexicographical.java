package com.company.coding2.recursion.recursion2;

public class lexicographical {
    public static void main(String[] args) {
      for (int i=1;i<10;i++){
          lexial(i,100);
      }
    }
    public static void lexial(int i,int n){
        if (i>n){
            return;
        }
        System.out.print(i+" ");
        for (int j=0;j<10;j++){
            lexial(10*i+j,n);
        }
    }
}
