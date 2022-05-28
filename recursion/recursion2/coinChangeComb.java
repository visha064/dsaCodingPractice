package com.company.coding2.recursion.recursion2;

public class coinChangeComb {
    public static int solve2(int[] arr,int tar){
        int[] ans = new int[tar+1];
        ans[0]=1;
        for (int i=0;i<arr.length;i++){
            for (int j=arr[i];j<ans.length;j++){
                ans[j]+=ans[j-arr[i]];
            }
        }
        return ans[ans.length-1];
    }
    public static int solve(int[] arr,int tar){
        int[][] ans = new int[arr.length+1][tar+1];
        for (int k=0;k<ans[0].length;k++){
            if (k==0)
                ans[0][k]=1;
            else
                ans[0][k]=0;
        }
        for (int i=1;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                if (j==0){
                    ans[i][j]=1;
                }else if(j-arr[i-1]>=0){
                    ans[i][j]=ans[i-1][j]+ans[i][j-arr[i-1]];
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
        int [] arr ={2,3,5,6};
        int tar = 10;
        System.out.println(solve(arr,tar));
        System.out.println(solve2(arr,tar));
    }
}
