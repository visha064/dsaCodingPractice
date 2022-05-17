package com.company.coding2.recursion.recursion2;

public class MinCostPath {

    public static int solve(int[][] cost){
        int n=cost.length;
        int [][] path =new int[n][n];
        for (int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if (i==n-1 && j==n-1){
                    path [n-1][n-1]= cost[n-1][n-1];
                }
                else if (i==n-1){
                    path[i][j]=cost[i][j]+path[i][j+1];
                }else if (j==n-1){
                    path[i][j]=cost[i][j]+path[i+1][j];
                }else{
                    path[i][j]=cost[i][j]+Integer.min(path[i+1][j],path[i][j+1]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(path[i][j]+"  ");
            }
            System.out.println();
        }
        return path[0][0];
    }

    public static void main(String[] args) {
        int [][] cost = {{1,2,300},{2,4,3},{100,4,5}};
        System.out.println(solve(cost));
//1   2  300
//2   4  3
//100 4  5
    }
}
