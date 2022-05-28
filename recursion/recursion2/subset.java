package com.company.coding2.recursion.recursion2;

public class subset {

    public static boolean solve(int [] arr,int tar){
        boolean [][] ans = new boolean[arr.length+1][tar+1];
        for (int k=0;k<ans[0].length;k++){
            if(k==0){
                ans[0][k]=true;
            }else{
                ans[0][k]=false;
            }
        }
        for (int i=1;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                if (j==0){
                    ans[i][j]=true;
                }else if (ans[i-1][j]==true){
                    ans[i][j]=true;
                }else if(j-arr[i-1]>=0&&ans[i-1][j-arr[i-1]]){
                    ans[i][j]=true;
                }else{
                    ans[i][j]=ans[i-1][j];
                }
            }
        }
        for (int x=0;x<ans.length;x++){
            for (int y=0;y<ans[0].length;y++){
                System.out.print(ans[x][y]+"  ");
            }
            System.out.println();
        }
        return ans[ans.length-1][ans[0].length-1];
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6};
        int target =5;
        System.out.println(solve(arr,target));
    }
}
