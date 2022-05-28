package com.company.coding2.recursion.recursion2;

public class coinChangePerm {
    public static int solve(int[]arr,int tar){
        int[] ans = new int[tar+1];
        ans[0]=1;
        for (int i=1;i<=tar;i++){
            for (int j=0;j<arr.length;j++){
                if (i-arr[j]>=0){
                    ans[i]+=ans[i-arr[j]];
                }
            }
        }
        return ans[tar];
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5};
        int tar = 7;
        System.out.println(solve(arr,tar));
    }
}
