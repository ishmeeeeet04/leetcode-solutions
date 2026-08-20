class Solution {
    public List<String> fizzBuzz(int n) {
         List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            // divisible by both
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            }

            // divisible by 3
            else if (i % 3 == 0) {
                ans.add("Fizz");
            }

            // divisible by 5
            else if (i % 5 == 0) {
                ans.add("Buzz");
            }

            // none
            else {
                ans.add(String.valueOf(i));
            }
        }

        return ans;
    }
}