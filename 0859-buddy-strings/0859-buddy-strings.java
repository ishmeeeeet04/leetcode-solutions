class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length()
                != goal.length()) {

            return false;
        }

        // case 1: already equal
        if (s.equals(goal)) {

            int[] freq =
                    new int[26];

            for (char ch :
                    s.toCharArray()) {

                freq[ch - 'a']++;

                // duplicate found
                if (freq[ch - 'a']
                        > 1) {

                    return true;
                }
            }

            return false;
        }

        // case 2: not equal
        int first = -1;
        int second = -1;

        for (int i = 0;
             i < s.length(); i++) {

            if (s.charAt(i)
                    != goal.charAt(i)) {

                if (first == -1) {

                    first = i;
                }

                else if
                (second == -1) {

                    second = i;
                }

                else {

                    // more than
                    // 2 mismatch
                    return false;
                }
            }
        }

        return second != -1
                &&
                s.charAt(first)
                        ==
                        goal.charAt(second)
                &&
                s.charAt(second)
                        ==
                        goal.charAt(first);
    }
}