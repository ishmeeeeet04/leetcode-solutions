class Solution {
    public String toGoatLatin(String sentence) {
        String vowels =
                "aeiouAEIOU";

        String[] words =
                sentence.split(" ");

        StringBuilder result =
                new StringBuilder();

        StringBuilder suffix =
                new StringBuilder();

        for (int i = 0;
             i < words.length;
             i++) {

            String word = words[i];

            // add one more 'a'
            suffix.append("a");

            // vowel
            if (vowels.indexOf(
                    word.charAt(0))
                    != -1) {

                result.append(word);
            }

            // consonant
            else {

                result.append(
                        word.substring(1))
                      .append(
                        word.charAt(0));
            }

            result.append("ma")
                  .append(suffix);

            // avoid extra space
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}