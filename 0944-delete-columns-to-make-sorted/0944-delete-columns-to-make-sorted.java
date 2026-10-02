class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();

        int deleteCount = 0;

        // traverse columns
        for (int col = 0;
             col < cols;
             col++) {

            // check rows
            for (int row = 1;
                 row < rows;
                 row++) {

                if (strs[row]
                        .charAt(col)
                        <
                        strs[row - 1]
                                .charAt(col)) {

                    deleteCount++;
                    break;
                }
            }
        }

        return deleteCount;
    }
}