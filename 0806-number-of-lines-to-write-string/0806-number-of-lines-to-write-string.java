class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentWidth = 0;

        for (char ch : s.toCharArray()) {

            int width =
                    widths[ch - 'a'];

            // fits in current line
            if (currentWidth
                    + width <= 100) {

                currentWidth += width;
            }

            // new line needed
            else {

                lines++;
                currentWidth = width;
            }
        }

        return new int[]{
                lines,
                currentWidth
        };
    }
}