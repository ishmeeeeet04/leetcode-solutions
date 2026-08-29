class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0, 1});

        grid[0][0] = 1;

        int[][] directions = {
            {-1, -1},
            {-1, 0},
            {-1, 1},
            {0, -1},
            {0, 1},
            {1, -1},
            {1, 0},
            {1, 1}
        };

        while (!queue.isEmpty()) {

            int[] cell = queue.poll();

            int r = cell[0];
            int c = cell[1];
            int distance = cell[2];

            if (r == n - 1 && c == n - 1) {
                return distance;
            }

            for (int[] dir : directions) {

                int newRow = r + dir[0];
                int newCol = c + dir[1];

                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < n &&
                    grid[newRow][newCol] == 0) {

                    grid[newRow][newCol] = 1;

                    queue.offer(new int[]{
                        newRow,
                        newCol,
                        distance + 1
                    });
                }
            }
        }

        return -1;
    }
}