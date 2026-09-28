class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while (j < typed.length()) {

            // characters match
            if (i < name.length()
                    &&
                    name.charAt(i)
                    ==
                    typed.charAt(j)) {

                i++;
                j++;
            }

            // long press
            else if (j > 0
                    &&
                    typed.charAt(j)
                    ==
                    typed.charAt(j - 1)) {

                j++;
            }

            // invalid character
            else {

                return false;
            }
        }

        // all name chars used?
        return i == name.length();
    }
}