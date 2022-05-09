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
    public static ArrayList<String> dignolcase(int r,int c, int x,int y){

        if (x>=c||y>=r){
            ArrayList<String> a =new ArrayList<>();
            return a;
        }
        if (x==c-1&&y==r-1){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        ArrayList<String> fans = new ArrayList<>();
        for (int i=1;i<r;i++){
            ArrayList<String> ansv = dignolcase(r,c,x,y+i);
            for (String s:ansv){
                fans.add("v"+i+s);
            }
        }
        for (int j=1;j<c;j++){
            ArrayList<String> ansh = dignolcase(r,c,x+j,y);
            for (String s:ansh){
                fans.add("h"+j+s);
            }
        }
        for (int k=1;k<r;k++){
            ArrayList<String> ansd = dignolcase(r,c,x+k,y+k);
            for (String s:ansd){
                fans.add("d"+k+s);
            }
        }
        return fans;
    }
    public static void keyword(String str, String ans){

        if (str.length()==0){
            System.out.print(ans+" ");
            return;
        }

        String ques = str.substring(1);
        char ch = str.charAt(0);
        int idx = ch-'0';
        for (int i=0;i<key[idx].length();i++){
            keyword(ques,ans+key[idx].charAt(i));
        }
    }
    public static void stair(int n,String ans){
        if (n==0){
            System.out.print(ans+" ");
            return;
        }
        if (n<0){
            return;
        }

        stair(n-1,ans+1);
        stair(n-2,ans+2);
        stair(n-3,ans+3);

    }
    public static void path2d(int r,int c,int x,int  y,String ans){
        if (x==c||y==r){
            return;
        }
        if (x==c-1&&y==r-1){
            System.out.print(ans+" ");

            return;
        }
        path2d(r,c,x+1,y,ans+"h");
        path2d(r,c,x,y+1,ans+"v");
    }
    public static void pathjump(int r,int c,int x,int  y,String ans){
        if (x>=c||y>=r){
            return;
        }
        if (x==c-1&&y==r-1){
            System.out.print(ans+" ");
            return;
        }
        for (int i=1;i<c||i<r;i++){
            pathjump(r,c,x+i,y,ans+"h"+i);
            pathjump(r,c,x,y+i,ans+"v"+i);
            pathjump(r,c,x+i,y+i,ans+"d"+i);

        }
    }
    public static void permutation(String str,String ans){
        if (str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i=0;i<str.length();i++){
            StringBuilder s=new StringBuilder(str);
            char ch=s.charAt(i);
            s.deleteCharAt(i);
            permutation(s.toString(),ans+ch);
        }
    }
    public static void encoding(String str,String ans){
        if (str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        if (str.charAt(0)!='0'){
            int i=str.charAt(0)-'0';
            char ch=(char)('a'+i-1);
            encoding(str.substring(1),ans+ch);
            if (str.length()>1&&Integer.parseInt(str.substring(0,2))<=26){
                int j=Integer.parseInt(str.substring(0,2));
                char ch2=(char)('a'+j-1);
                encoding(str.substring(2),ans+ch2);
            }
        }
    }
    public static void main(String[] args) {
        String str = "helllkhjiearjiojSDgdlfdjgkldfdjglo";
        String ans = compress(str);
        System.out.println(ans);
        System.out.println(getsubseq("abc"));
        System.out.println(getkpc("789"));
        System.out.println(staircase(4));
        System.out.println(twodcase(3,4,0,0));
        System.out.println(dignolcase(3,4,0,0));
        keyword("789","");
        System.out.println();
        stair(4,"");
        System.out.println();
        path2d(3,4,0,0,"");
        System.out.println();
        pathjump(3,4,0,0,"");
        System.out.println();
        permutation("abc","");
        encoding("465","");


    }

}
