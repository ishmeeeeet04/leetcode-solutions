class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        Queue<int[]> queue = new LinkedList<>();

        image[sr][sc] = color;
        queue.offer(new int[]{sr, sc});

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!queue.isEmpty()) {

            int[] cell = queue.poll();

            int r = cell[0];
            int c = cell[1];

            for (int[] dir : directions) {

                int newRow = r + dir[0];
                int newCol = c + dir[1];

                if (newRow >= 0 && newRow < image.length &&
                    newCol >= 0 && newCol < image[0].length &&
                    image[newRow][newCol] == originalColor) {

                    image[newRow][newCol] = color;

                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

        return image;
    }
}