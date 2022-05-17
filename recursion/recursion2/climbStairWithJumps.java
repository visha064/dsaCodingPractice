package com.company.coding2.recursion.recursion2;

public class climbStairWithJumps {

    public static int solve(int n,int[] j) {
        int[] ans = new int[n + 1];
        ans[n] = 1;
        for (int i = n - 1; i >= 0; i--) {

            for (int k = 1; k <= j[i]; k++) {
                if (!(k + i > n)) {
                    ans[i] += ans[k + i];
                }
            }
        }
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
  return ans[0];
    }
    public static void main(String[] args) {
        int[] jump={3,3,0,2,2,3};
        int n=6;
        System.out.println(solve(n,jump));
    }
}
