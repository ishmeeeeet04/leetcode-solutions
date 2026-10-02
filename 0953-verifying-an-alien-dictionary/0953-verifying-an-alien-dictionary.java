class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank =
                new int[26];

        // store alien order
        for (int i = 0;
             i < 26;
             i++) {

            rank[order.charAt(i)
                    - 'a'] = i;
        }

        // compare adjacent words
        for (int i = 0;
             i < words.length - 1;
             i++) {

            String w1 =
                    words[i];

            String w2 =
                    words[i + 1];

            int minLen =
                    Math.min(
                            w1.length(),
                            w2.length());

            boolean foundDifference =
                    false;

            // compare chars
            for (int j = 0;
                 j < minLen;
                 j++) {

                char c1 =
                        w1.charAt(j);

                char c2 =
                        w2.charAt(j);

                if (c1 != c2) {

                    if (rank[c1 - 'a']
                            >
                            rank[c2 - 'a']) {

                        return false;
                    }

                    foundDifference =
                            true;

                    break;
                }
            }

            // prefix case
            if (!foundDifference
                    &&
                    w1.length()
                    >
                    w2.length()) {

                return false;
            }
        }

        return true;
    }
}