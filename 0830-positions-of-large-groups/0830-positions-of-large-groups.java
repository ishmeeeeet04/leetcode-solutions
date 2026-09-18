class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans =
                new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int start = i;

            // move while same chars
            while (i < s.length() - 1
                    && s.charAt(i)
                    == s.charAt(i + 1)) {

                i++;
            }

            int end = i;

            // large group
            if (end - start + 1 >= 3) {

                ans.add(Arrays.asList(
                        start, end));
            }

            i++;
        }

        return ans;
    }
}