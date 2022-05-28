package com.company.coding2.recursion.recursion2;

public class decodeways {
    public static void main(String[] args) {
        String str = "1120";
        System.out.println(str.length());
        int [] ans = new int[str.length()];
        ans[0]=1;
        for(int i=1;i< ans.length;i++){
            if (str.charAt(i-1)=='0'&& str.charAt(i)=='0'){
                ans[i]=0;
            }else if (str.charAt(i-1)=='0'&& str.charAt(i)!='0'){
                ans[i]=ans[i-1];
            }else if (str.charAt(i-1)!='0'&& str.charAt(i)=='0'){
                if (str.charAt(i-1)=='1'||str.charAt(i-1)=='2'){
                    ans[i]=i>1?ans[i-2]:1;
                }
            }else if (str.charAt(i-1)!='0'&& str.charAt(i)!='0'){
                ans[i]=ans[i-1];
                if (Integer.parseInt(str.substring(i-1,i+1))<27){
                    ans[i]+=i>1?ans[i-2]:1;
                }
            }
        }
        for (int item:ans){
            System.out.print(item+" ");
        }
    }
}
