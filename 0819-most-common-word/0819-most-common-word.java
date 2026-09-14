import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // lowercase
        paragraph =
                paragraph.toLowerCase();

        // remove punctuation
        paragraph =
                paragraph.replaceAll(
                        "[^a-z ]", " ");

        // banned words set
        HashSet<String> bannedSet =
                new HashSet<>();

        for (String word : banned) {
            bannedSet.add(word);
        }

        // frequency map
        HashMap<String, Integer> map =
                new HashMap<>();

        String answer = "";
        int maxFreq = 0;

        String[] words =
                paragraph.split("\\s+");

        for (String word : words) {

            if (!bannedSet
                    .contains(word)) {

                map.put(word,
                        map.getOrDefault(
                                word, 0) + 1);

                int freq =
                        map.get(word);

                if (freq > maxFreq) {

                    maxFreq = freq;
                    answer = word;
                }
            }
        }

        return answer;
    }
}