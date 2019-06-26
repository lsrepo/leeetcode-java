package Problem70;

/**
 * Buttom-up
 */
class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n ; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}

// Top-down
//class Solution {
//    private int climbStairsHelper(int n,int[] dict){
//        if (n < 0) return 0;
//        if (n == 0 || n == 1) return 1;
//        if (dict[n] == 0){
//            dict[n] = climbStairsHelper(n - 2,dict) + climbStairsHelper(n - 1,dict);
//        }
//        return dict[n];
//    }
//
//    public int climbStairs(int n) {
//        int[] dict = new int[n+1];
//        return climbStairsHelper(n, dict);
//    }
//}