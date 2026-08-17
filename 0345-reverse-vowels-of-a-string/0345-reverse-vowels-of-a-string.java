class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // find left vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // find right vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}