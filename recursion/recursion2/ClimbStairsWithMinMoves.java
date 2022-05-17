package com.company.coding2.recursion.recursion2;

public class ClimbStairsWithMinMoves {

    public static int solve(int n,int[] jump){
        Integer[] ans=new Integer[n+1];
        ans[n]=0;
        for (int i=n-1;i>=0;i--){
            int min=100;
            for (int j=1;i+j<=n&&j<=jump[i] ;j++){
                int temp=1+ans[i+j];
                if (min>temp){
                    min=temp;
                }
            }

            ans[i]=min;
        }
        for(Integer in:ans){
            System.out.println(in);
        }
        return ans[0];
    }

    public static void main(String[] args) {
        int [] jump = {3,2,4,2,0,2,3,1,2,2};
        int n=10;
        System.out.println(solve(n,jump));
    }
}
