package com.company.coding2.recursion.recursion2;

public class goldmine {

    public static int golding(int [][] gold){
        int n = gold.length;
        int[][] miner = new int[n][n];

        for (int j=n-1;j>=0;j--){
            for (int i=n-1;i>=0;i--){
                if (j==n-1){
                    miner[i][j]=gold[i][j];
                }else if (i==0){
                    miner[i][j]=gold[i][j]+Math.max(miner[i][j+1],miner[i+1][j+1]);
                }else if(i==n-1){
                    miner[i][j]=gold[i][j]+Math.max(miner[i][j+1],miner[i-1][j+1]);
                }else{
                    miner[i][j]=gold[i][j]+Math.max(miner[i][j+1],Math.max(miner[i+1][j+1],miner[i-1][j+1]));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(miner[i][j]+"  ");
            }
            System.out.println();
        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (max<miner[i][0])
                max=miner[i][0];
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] gold = {{0,1,4,2,8,2},
                         {4,3,6,5,0,4},
                         {1,2,4,1,4,6},
                         {2,0,7,3,2,2},
                         {3,1,5,9,2,4},
                         {2,7,0,8,5,1}};
        System.out.println(golding(gold));
    }
}
