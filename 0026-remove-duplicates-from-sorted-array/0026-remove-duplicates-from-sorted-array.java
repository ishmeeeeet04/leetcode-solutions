class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        // j explores the array
        for (int j = 1; j < nums.length; j++) {

            // Found a new unique element
            if (nums[i] != nums[j]) {

                i++;

                // Place the new unique element at the next position
                nums[i] = nums[j];
            }
        }

        // Number of unique elements
        return i + 1;
    }
}