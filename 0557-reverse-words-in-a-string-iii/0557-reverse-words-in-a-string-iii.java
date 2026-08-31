class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            // skip spaces (if any)
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }

            if (i >= s.length()) break;

            // start of word
            int start = i;

            // move till end of word
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }

            int end = i - 1;

            // reverse this word
            while (end >= start) {
                result.append(s.charAt(end));
                end--;
            }

            // add space if not last word
            result.append(" ");
        }

        // remove last extra space
        return result.toString().trim();
    }
}