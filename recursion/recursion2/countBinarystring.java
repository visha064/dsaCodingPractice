package com.company.coding2.recursion.recursion2;

public class countBinarystring {
    public static void main(String[] args) {
        int n=6;
        int[][] ans = new int[2][n+1];
        ans [0][1]=1;
        ans [1][1]=1;
        for (int j=2;j<ans[0].length;j++){
            for (int i=0;i< ans.length;i++){
                if (i==0){
                    ans[i][j]=ans[i+1][j-1];
                }else{
                    ans[i][j]=ans[i][j-1]+ans[i-1][j-1];
                }
            }
        }
        System.out.println(ans[ans.length-1][ans[0].length-1]+ans[ans.length-2][ans[0].length-1]);
    }
}
