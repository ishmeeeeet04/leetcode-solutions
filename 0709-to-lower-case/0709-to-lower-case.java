class Solution {
    public String toLowerCase(String s) {
         StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            sb.append(Character.toLowerCase(ch));
        }

        return sb.toString();
    }
}