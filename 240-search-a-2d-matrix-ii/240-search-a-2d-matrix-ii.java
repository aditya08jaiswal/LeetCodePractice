class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int maxCol = matrix[0].length;
        int maxRow = matrix.length;

        for (int row=0; row<maxRow; row++) {
            for (int col=0; col<maxCol; col++) {
                if (matrix[row][col]==target) {
                    return true;
                } else if (matrix[row][col]>target) {
                    maxCol = col;
                    break;
                }
            }
            
            if (matrix[row][0]>target) {
                break;
            }
            
        }
        
        return false;
    }
}