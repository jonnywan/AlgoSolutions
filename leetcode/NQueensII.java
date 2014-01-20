public class NQueensII {
    public int totalNQueens(int n) {
        ArrayList<String[]> res = new ArrayList<String[]>();
        int[] board = new int[n];
        placeQueenOnBoard(res, 0, board);
        return res.size();
    }

    public void placeQueenOnBoard(ArrayList<String[]> res, int row, int[] board) {
        int n = board.length;
        if(row == n) {
            String[] s = new String[n];
            res.add(s);
        } else {
            for(int col = 0; col < n; col++) {
                if(isSafePlace(row, col, board)) {
                    board[row] = col;
                    placeQueenOnBoard(res, row + 1, board);
                    board[row] = 0;
                }
            }
        }
    }

    public boolean isSafePlace(int row, int col, int[] board) {
        for(int i = 0; i < row; i++)
            if(board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row))
                return false;
        return true;
    }
}
