package com.company.coding2.recursion.recursion2;

public class joesph {

    public static void solve(int[]arr,int n,int m){
        if (n==1){
            System.out.println(arr[0]);
            return;
        }
        for (int i=0;i<n-1;i++){
            arr[i]=arr[(i+m)%n];
        }
        solve(arr,n-1,m);
    }

    public static void main(String[] args) {
        int n=9;
        int m=5;
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i;
        }
        solve(arr,n,m);
    }
}
