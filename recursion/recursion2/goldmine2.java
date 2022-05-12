package com.company.coding2.recursion.recursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class goldmine2 {

    public static void main(String[] args) {
        int[][] world = new int[5][5];
        Scanner sc = new Scanner(System.in);
       for (int k=0;k<5;k++)
           for (int l=0;l<5;l++){
               world[k][l]=sc.nextInt();
           }
//       0  0  0  10 4
//       20 40 0  6  7
//       6  1  6  0  8
//       0  0  0  0  5
//       5  40 5  0  0
        for (int[]r:world) {
            for (int c : r) {
                System.out.print(c + "  ");
            }
            System.out.println();
        }
        System.out.println();
        boolean[][] visited = new boolean[5][5];
       int max=0;
        for (int i=0;i<world.length;i++){
            for (int j=0;j<world[0].length;j++){
                if (world[i][j]!=0&&!visited[i][j]){
                    ArrayList<Integer> gold = new ArrayList<>();
                    findgold(world,visited,i,j,gold);
                    int sum=0;
                    for (int g:gold){
                        System.out.print(g +" ");
                        sum+=g;
                    }
                    System.out.println();
                    System.out.println(sum);
                    if (max<sum){
                        max=sum;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(max);

    }
    public static void findgold(int[][] world,boolean[][] visited,int i,int j,ArrayList<Integer> gold){
        if (i<0 || j<0 || i>= world.length || j>= world.length || visited[i][j] || world[i][j]==0){
            return;
        }

        visited[i][j]=true;
        gold.add(world[i][j]);
        findgold(world,visited,i+1,j,gold);
        findgold(world,visited,i,j+1,gold);
        findgold(world,visited,i-1,j,gold);
        findgold(world,visited,i,j-1,gold);

    }
}
