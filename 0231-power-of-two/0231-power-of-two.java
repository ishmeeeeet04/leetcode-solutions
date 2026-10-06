class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        int[] dp = new int[31];
        dp[0] = 1;

        for (int i = 1; i < 31; i++) {
            dp[i] = dp[i - 1] * 2;
            if (dp[i] == n) {
                return true;
            }
        }

        return dp[0] == n;
    }
}