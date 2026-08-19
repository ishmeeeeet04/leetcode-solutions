class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean negative = false;

        // handle negative
        if (num < 0) {
            negative = true;
            num = -num;
        }

        StringBuilder ans = new StringBuilder();

        while (num > 0) {

            ans.append(num % 7);

            num = num / 7;
        }

        // add sign
        if (negative) {
            ans.append("-");
        }

        return ans.reverse().toString();
    }
}