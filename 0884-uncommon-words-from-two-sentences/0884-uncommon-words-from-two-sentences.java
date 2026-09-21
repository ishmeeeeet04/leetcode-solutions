import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      HashMap<String, Integer> map =
                new HashMap<>();

        // count s1 words
        for (String word :
                s1.split(" ")) {

            map.put(word,
                    map.getOrDefault(
                            word, 0) + 1);
        }

        // count s2 words
        for (String word :
                s2.split(" ")) {

            map.put(word,
                    map.getOrDefault(
                            word, 0) + 1);
        }

        List<String> ans =
                new ArrayList<>();

        // collect uncommon words
        for (String word :
                map.keySet()) {

            if (map.get(word)
                    == 1) {

                ans.add(word);
            }
        }

        return ans.toArray(
                new String[0]);   
    }
}