/*
 * Given a m x n grid filled with non-negative numbers, find a path from top 
 * left to bottom right which minimizes the sum of all numbers along its path.

 * Note: You can only move either down or right at any point in time.
 * 
 */
public class MinimumPathSum {

/****************************** updated 2013/11/25 ****************************/

    public int minPathSum(int[][] grid) {
        int xLen = grid.length;
        int yLen = grid[0].length;
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                if (i == 0 && j > 0)
                    grid[i][j] += grid[i][j - 1];
                else if (i > 0 && j == 0) 
                    grid[i][j] += grid[i - 1][j];
                else if (i > 0 && j > 0)
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[xLen - 1][yLen - 1];
    }

/**************************** updated 20141016 *******************************/

    public int uniquePaths(int m, int n) {
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++)
                dp[j] += dp[j - 1];
        }
        return dp[m - 1];
    }

}
