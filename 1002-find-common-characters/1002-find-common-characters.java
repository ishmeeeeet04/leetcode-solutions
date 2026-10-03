class Solution {
    public List<String> commonChars(String[] words) {
      int[] common =
                new int[26];

        // first word frequency
        for (char ch :
                words[0]
                        .toCharArray()) {

            common[ch - 'a']++;
        }

        // compare with other words
        for (int i = 1;
             i < words.length;
             i++) {

            int[] temp =
                    new int[26];

            for (char ch :
                    words[i]
                            .toCharArray()) {

                temp[ch - 'a']++;
            }

            // take minimum
            for (int j = 0;
                 j < 26;
                 j++) {

                common[j] =
                        Math.min(
                                common[j],
                                temp[j]);
            }
        }

        List<String> ans =
                new ArrayList<>();

        // build answer
        for (int i = 0;
             i < 26;
             i++) {

            while (common[i] > 0) {

                ans.add(
                        String.valueOf(
                                (char)
                                        (i + 'a')));

                common[i]--;
            }
        }

        return ans;
          
    }
}