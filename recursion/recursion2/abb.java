package com.company.coding2.recursion.recursion2;

public class abb {

    public static void abber(String str,String ans,int count){
        if (str.length()==0){
            if (count>0){
                ans=ans+count;
            }
            System.out.print(ans+ " ");
            return;
        }
        char ch=str.charAt(0);
        String rstr=str.substring(1);
        abber(rstr,count>0?ans+count+ch:ans+ch,0);
        count=count+1;
        abber(rstr,ans,count);
    }

    public static void main(String[] args) {
        String str ="pepcoding";
        abber(str,"",0);
    }
}
