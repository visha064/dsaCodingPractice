package com.company.coding2.recursion.recursion2;

public class countsubsequenceform {
    public static void main(String[] args) {
        String str = "abcabc";
        int[][] ans = new int[3][str.length()+1];
        for (int j=1;j<ans[0].length;j++){
            for (int i=0;i< ans.length;i++){
                if (str.charAt(j-1)=='a'&& i==0){
                    ans[i][j]=2*ans[i][j-1]+1;
                }else  if (str.charAt(j-1)=='b'&& i==1){
                    ans[i][j] =2*ans[i][j-1]+ans[i-1][j];
                }else  if (str.charAt(j-1)=='c'&& i==2){
                    ans[i][j] =2*ans[i][j-1]+ans[i-1][j];
                }else{
                    ans[i][j]=ans[i][j-1];
                }
            }
        }
        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(ans[ans.length-1][ans[0].length-1]);
    }
}
