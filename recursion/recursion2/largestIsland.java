package com.company.coding2.recursion.recursion2;

import java.util.Scanner;

public class largestIsland {
public static void largest(int[][] world,boolean[][] visited,int i,int j,int[] size){
    if (i<0 ||j<0||i>= world.length||j>= world.length||visited[i][j] || world[i][j]==0){
        return ;
    }
    visited[i][j]=true;
    size[0]++;
    largest(world,visited,i+1,j,size);
    largest(world,visited,i,j+1,size);
    largest(world,visited,i-1,j,size);
    largest(world,visited,i,j-1,size);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] world = new int[5][5];
        for (int l=0;l<5;l++)
            for (int k=0;k<5;k++)
                world[l][k]= sc.nextInt();
        System.out.println();
        int max=0;
        boolean[][] visited = new boolean[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (world[i][j]!=0&&!visited[i][j]){
                    int[] size = {0};
                    largest(world,visited,i,j,size);
                    if (max<size[0]){
                        max=size[0];
                    }
                }
            }
        }
        System.out.println(max);
    }
}

//1 0 0 1 1
//1 1 0 1 1
//1 0 1 0 1
//0 1 0 1 1
//0 1 0 0 1