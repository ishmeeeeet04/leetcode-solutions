class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    grid[i][j] = '0';
                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int r = cell[0];
                        int c = cell[1];
                        for (int[] dir : directions) {
                            int newRow = r + dir[0];
                            int newCol = c + dir[1];
                            if (newRow >= 0 && newRow < grid.length &&
                                newCol >= 0 && newCol < grid[0].length &&
                                grid[newRow][newCol] == '1') {

                                // Mark visited
                                grid[newRow][newCol] = '0';

                                // Add to queue
                                queue.offer(new int[]{newRow, newCol});
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}