package com.company.coding2.recursion;

public class arrary {

    public static void display(int[] arr,int idx){
        if (arr.length==idx){
            return;
        }
        System.out.print(arr[idx]+" ");
        display(arr,idx+1);
    }

    public static void displayrev(int[] arr,int idx){
        if (arr.length==idx){
            return;
        }
        displayrev(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
//    static int m = Integer.MIN_VALUE;
    public static int max(int[]arr,int idx){
        if (idx==arr.length-1)
            return arr[idx];
        int m = max(arr,idx+1);
        if (m<arr[idx])
            return arr[idx];
        return m;
    }
    public static int firstidx(int[]arr, int idx,int s){
        if (arr.length-1==idx){
            if (s==arr[arr.length-1])
                return idx;
            else{
                return -1;
            }
        }
        if (arr[idx]==s)
            return idx;
        int ans = firstidx(arr,idx+1,s);
        return ans;
    }
    public static int lastidx(int[]arr,int idx,int s){
        if (arr.length-1==idx){
            if (s==arr[arr.length-1])
                return idx;
            else{
                return -1;
            }
        }
        int ans = lastidx(arr,idx+1,s);
        if (ans==-1){
            if (arr[idx]==s)
                return idx;}

            return ans;
    }
    public static void allidx(int[]arr,int idx,int s){
        if (idx==arr.length){
            return;
        }
        if (arr[idx]==s){
            System.out.print(idx+" ");
        }
        allidx(arr,idx+1,s);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,30,35};
        display(arr,0);
        System.out.println();
        displayrev(arr,0);
        System.out.println();
        System.out.print(max(arr,0));
        System.out.println();
        int[] all = new int[arr.length];
        for (int i:all){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(firstidx(arr,0,30));
        System.out.println(lastidx(arr,0,30));
        allidx(arr,0,30);
    }
}
