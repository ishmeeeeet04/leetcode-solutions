/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int index = 0;
    List<Integer> result = new ArrayList<>();

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

        if (dfs(root, voyage)) {
            return result;
        }

        return Arrays.asList(-1);
    }

    private boolean dfs(TreeNode root, int[] voyage) {

        if (root == null) {
            return true;
        }

        // Current root must match voyage
        if (root.val != voyage[index]) {
            return false;
        }

        index++;

        // Left child is not the expected next node
        if (root.left != null && root.left.val != voyage[index]) {

            // Right child must be the expected node
            if (root.right != null && root.right.val == voyage[index]) {

                result.add(root.val);

                // Flip: RIGHT first, then LEFT
                if (!dfs(root.right, voyage)) {
                    return false;
                }

                if (!dfs(root.left, voyage)) {
                    return false;
                }

                return true;
            }

            return false;
        }

        // Normal order: LEFT → RIGHT
        if (!dfs(root.left, voyage)) {
            return false;
        }

        if (!dfs(root.right, voyage)) {
            return false;
        }

        return true;
    }
}