class Solution {
    public boolean isValidSudoku(char[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        // row wise
        for (int r=0; r<rows; r++) {
            Set<Character> set = new HashSet<>();
            for (int c=0; c<cols; c++) {
                char element = board[r][c];
                if (element != '.' && set.contains(element)) {
                    return false;
                }
                set.add(element);
            }
        }

        // col wise
        for (int c=0; c<cols; c++) {
            Set<Character> set = new HashSet<>();
            for (int r=0; r<rows; r++) {
                char element = board[r][c];
                if (element != '.' && set.contains(element)) {
                    return false;
                }
                set.add(element);
            }
        }

        // inside each 3x3 matrix
        for (int i=0; i<9; i+=3) {
            for (int j=0; j<9; j+=3) {
                Set<Character> set = new HashSet<>();
                for (int k=0; k<9; k++) {
                    int row = i + k / 3;
                    int col = j + k % 3;
                    char element = board[row][col];
                    if (element != '.' && set.contains(element)) {
                        return false;
                    }
                    set.add(element);
                }
            }
        }

        return true;
    }
}