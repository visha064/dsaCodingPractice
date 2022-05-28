package com.company.coding2.recursion.recursion2;

import java.util.ArrayList;

public class try01knapsap {
    public static void main(String[] args) {
        int [] cost = {12,13,8,10};
        int [] avab = {3,2,1,5};
        int bag = 7;
        int[][] sackwt = new int[avab.length+1][bag+1];
        for (int i=1;i<=avab.length;i++){
            for (int cap=0;cap<=bag;cap++){
              if (avab[i-1]>cap){
                  sackwt[i][cap]=sackwt[i-1][cap];
              }else{
                  if(sackwt[i-1][cap]>sackwt[i-1][cap-avab[i-1]]+cost[i-1]){
                      sackwt[i][cap]=sackwt[i-1][cap];
                  }else{
                      sackwt[i][cap]=sackwt[i-1][cap-avab[i-1]]+cost[i-1];
                  }
              }
            }
        }
        System.out.println(sackwt[sackwt.length-1][sackwt[0].length-1]);
    }
}
