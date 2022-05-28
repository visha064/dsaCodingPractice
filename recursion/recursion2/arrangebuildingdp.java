package com.company.coding2.recursion.recursion2;

public class arrangebuildingdp {
    public static int solve(int n){
        int b = 1;
        int s = 1;
        for (int i=2;i<=n;i++){
            int nb = s;
            int ns =s+b;
            s=ns;
            b=nb;
        }
        return s+b;
    }
    public static void main(String[] args) {
        int n=5;
        int ans1 = solve(n);
        int fans =ans1*ans1;
        System.out.println(fans);
    }
}
