class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        // start index
        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];  // frequency array

            // end index
            for (int j = i; j < n; j++) {

                // update freq
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // find max & min
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }
}