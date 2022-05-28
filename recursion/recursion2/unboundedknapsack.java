package com.company.coding2.recursion.recursion2;

public class unboundedknapsack {
    public static void main(String[] args) {
        int[] wt ={2,5,1,3,4};
        int[] cost={15,14,10,45,30};
        int maxcap = 7;
        int[] ans = new int[maxcap+1];
        for(int i=1;i<=maxcap;i++){
            for (int j=0;j<wt.length;j++){
                if (i>=wt[j]){
                    ans[i]=Math.max(ans[i],cost[j]+ans[i-wt[j]]);
                }
            }
        }
        for (int w:ans){
            System.out.print(w+" ");
        }

    }
}
