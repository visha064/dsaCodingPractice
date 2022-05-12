package com.company.coding2.recursion.recursion2;

public class nQueen {
    public static boolean isQueenSafe(){return true;}
    public static void queen(int[][] chess,int row, int[] stoprow,int[] stopdigv,int[] stopdigz){
        for (int col=0;col< chess.length;col++){
            stoprow[row]=1;
            stopdigz[row+col]=1;
            stopdigv[row-col+ chess.length-1]=1;
            if (isQueenSafe()){
//                queen(chess,row+1);
            }
        }

    }
    public static void main(String[] args) {
        int n=4;
        int[][] chess = new int[n][n];
        int row =0,col=0;
        int[] stoprow = new int[n];
        int[] stopdigv =new int[2*n-1];
        int[] stopdigz =new int[2*n-1];
       queen(chess,row,stoprow,stopdigv,stopdigz);
//        System.out.println(chess[0].length);
    }
}
