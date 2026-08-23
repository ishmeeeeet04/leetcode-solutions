class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map =
                new HashMap<>();

        // store list1
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> ans = new ArrayList<>();

        int minSum = Integer.MAX_VALUE;

        // check common strings
        for (int j = 0; j < list2.length; j++) {

            if (map.containsKey(list2[j])) {

                int sum =
                    map.get(list2[j]) + j;

                // smaller minimum found
                if (sum < minSum) {

                    ans.clear();
                    ans.add(list2[j]);
                    minSum = sum;
                }

                // same minimum
                else if (sum == minSum) {

                    ans.add(list2[j]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}