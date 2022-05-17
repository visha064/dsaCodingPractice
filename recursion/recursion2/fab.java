package com.company.coding2.recursion.recursion2;

public class fab {
    public static int fab(int n,int[] dp){
        if (n==1||n==0){
            return n;
        }
        if (dp[n]!=0){
            return dp[n];
        }
        System.out.println("hello"+n);
        int fab1=fab(n-1,dp);
        int fab2=fab(n-2,dp);
        dp[n]=fab1+fab2;
        return fab1+fab2;
    }
    public static int tabfab(int n){
        int [] ans = new int[n+1];
        ans[1]=1;
        for (int i=2;i<=n;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n];
    }
    public static void main(String[] args) {
        int n=555;
        int[] dp = new int[n+1];
        System.out.println(fab(n,dp));
        System.out.println(tabfab(n));

    }
}
