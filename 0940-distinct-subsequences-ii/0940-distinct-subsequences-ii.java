class Solution {
    public int distinctSubseqII(String s) {

        long MOD = 1000000007;
        long[] last = new long[26];

        long dp = 1; // empty subsequence

        for (int i = 0; i < s.length(); i++) {

            int idx = s.charAt(i) - 'a';

            long newDp = (2 * dp - last[idx] + MOD) % MOD;

            last[idx] = dp;

            dp = newDp;
        }

        return (int)((dp - 1 + MOD) % MOD);
    }
}