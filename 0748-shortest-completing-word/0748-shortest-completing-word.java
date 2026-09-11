class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
     int[] target = new int[26];

        // Count letters from licensePlate
        for (char ch :
                licensePlate.toCharArray()) {

            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                target[ch - 'a']++;
            }
        }

        String answer = "";

        for (String word : words) {

            if (isComplete(word, target)) {

                if (answer.equals("")
                        || word.length()
                        < answer.length()) {

                    answer = word;
                }
            }
        }

        return answer;
    }

    public boolean isComplete(
            String word,
            int[] target) {

        int[] freq = new int[26];

        // count word letters
        for (char ch :
                word.toCharArray()) {

            freq[ch - 'a']++;
        }

        // compare frequencies
        for (int i = 0; i < 26; i++) {

            if (freq[i] < target[i]) {
                return false;
            }
        }

        return true;   
    }
}