class Solution {
    public String reverseWords(String s) {
        

        s = s.trim();

        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            int j = i;

            // Find the beginning of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Append the word
            ans.append(s.substring(i + 1, j + 1));

            // Add space only if there are more words
            if (i >= 0) {
                ans.append(" ");
            }
        }

        return ans.toString().trim();
    }

}