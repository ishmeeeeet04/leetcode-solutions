class Solution {
    public boolean detectCapitalUse(String word) {
        boolean shouldBeCapital =
                word.length() > 1 &&
                Character.isUpperCase(word.charAt(1));

        // if second char uppercase,
        // first must also be uppercase
        if (shouldBeCapital &&
            Character.isLowerCase(word.charAt(0))) {

            return false;
        }

        // check remaining chars
        for (int i = 1; i < word.length(); i++) {

            if (Character.isUpperCase(word.charAt(i))
                != shouldBeCapital) {

                return false;
            }
        }

        return true;
        
    }
}