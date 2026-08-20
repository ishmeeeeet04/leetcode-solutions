class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            // add from a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // add from b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // current binary digit
            ans.append(sum % 2);

            // carry
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }
}