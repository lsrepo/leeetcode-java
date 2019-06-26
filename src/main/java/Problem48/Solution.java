package Problem48;

public class Solution {
    public void rotate(int[][] matrix) {

        int m = matrix.length / 2;
        int n = matrix.length;

        for (int row = 0; row < m; row++) {
            for (int col = row; col < n - row - 1; col++) {
                int tmp = matrix[row][col];

                matrix[row][col] = matrix[n-1-col][row];
                matrix[n-1-col][row] = matrix[n-1-row][n-1-col];
                matrix[n-1-row][n-1-col] = matrix[col][n-1-row];
                matrix[col][n-1-row] = tmp;
            }
        }
    }
}
