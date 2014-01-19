/*
 * The n-queens puzzle is the problem of placing n queens on an n¡Án chessboard 
 * such that no two queens attack each other.



 * Given an integer n, return all distinct solutions to the n-queens puzzle.

 * Each solution contains a distinct board configuration of the n-queens' 
 * placement, where 'Q' and '.' both indicate a queen and an empty space 
 * respectively.

 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:

 * [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],

 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 * 
 */
public class NQueens {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> res = new ArrayList<String[]>();
        int[] row = new int[n];
        int[] col = new int[n];
        dfs(res, row, col, 0, n);
        return res;
    }

    public void dfs(ArrayList<String[]> res, int[] row, int[] col, int r, int n) {
        if(r == n) {
            String[] s = new String[n];
            for(int i = 0; i < n; i++) {
                s[i] = "";
                for(int j = 0; j < n; j++) {
                    if(j != row[i])
                        s[i] += ".";
                    else
                        s[i] += "Q";
                }
            }
            res.add(s);
        }
        for(int i = 0; i < n; i++) {
            int j = 0;
            while(j < r) {
                if(Math.abs(r - j) == Math.abs(i - row[j])) 
                    break;
                j++;
            }
            if(col[i] == 0 && j == r) {
                row[r] = i;
                col[i] = 1;
                dfs(res, row, col, r + 1, n);
                row[r] = 0;
                col[i] = 0;
            }
        }
    }
}
