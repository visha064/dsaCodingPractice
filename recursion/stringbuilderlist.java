package com.company.coding2.recursion;

import java.util.ArrayList;

public class stringbuilderlist {

    public static String compress(String str){
        StringBuilder s = new StringBuilder();
        s.append(str.charAt(0));
        int count =1;
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)==str.charAt(i-1))
                count++;
            else{
                if (count==1) {
                    s.append(str.charAt(i));
                }else{
                    s.append(count);
                    s.append(str.charAt(i));
                }
                count=1;
            }
        }
        return s.toString();
    }
    public static ArrayList<String> getsubseq(String str){
        if (str==""){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> fans = getsubseq(str.substring(1));
        ArrayList<String> ffans = new ArrayList<>();
        for (String s:fans){
            ffans.add(""+s);
            ffans.add(str.charAt(0)+s);
        }
        return ffans;
    }
    static String[] key={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getkpc(String str){
        if (str==""){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;

        }

        ArrayList<String> ans=getkpc(str.substring(1));
        char ch=str.charAt(0);
        int idx = ch-'0';
        ArrayList<String> fans = new ArrayList<>();
        for (String s : ans){
            for (int j=0;j<key[idx].length();j++){
                fans.add(key[idx].charAt(j)+s);
            }
        }
        return fans;
    }
    public static ArrayList<String> staircase(int n){
        if (n==0){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> fans = new ArrayList<>();
        for (int i=1;i<=n;i++){
            ArrayList<String> ans = staircase(n-i);
            for (String s:ans){
                fans.add(i+s);
            }
        }
        return fans;
    }

    public static ArrayList<String> twodcase(int r,int c,int x,int y){
        if (x==c||y==r){
            ArrayList<String> a=new ArrayList<>();
            return a;
        }
        if (x==c-1&&y==r-1){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> ansh = twodcase(r,c,x+1,y);
        ArrayList<String> fans = new ArrayList<>();
        for (String s:ansh){
            fans.add("h"+s);
        }
        ArrayList<String> ansv = twodcase(r,c,x,y+1);
        for (String s:ansv){
            fans.add("v"+s);
        }
        return fans;
    }

    public static void main(String[] args) {
        String str = "helllkhjiearjiojSDgdlfdjgkldfdjglo";
        String ans = compress(str);
        System.out.println(ans);
        System.out.println(getsubseq("abc"));
        System.out.println(getkpc("78"));
        System.out.println(staircase(4));
        System.out.println(twodcase(3,4,0,0));
    }

}
