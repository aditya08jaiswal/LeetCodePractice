class Solution {
    public void rotate(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Transpose matrix
        for(int i=0; i<rows; i++) {
            for(int j=i; j<cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Replace columns
        for (int i=0; i<cols/2; i++) {
            for (int j=0; j<rows; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][cols-1-i];
                matrix[j][cols-1-i] = temp;
            }
        }
        
    }
}