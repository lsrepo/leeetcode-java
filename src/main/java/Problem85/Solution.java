package Problem85;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int getMaxArea(int[] hist, int n) {

        Stack<Integer> s = new Stack<>();

        int i = 0;
        int max = 0;
        while(i<n){
            if (s.empty()){
                s.push(i++);
            }
            // curr >= top
            else if ( hist[i] >= hist[s.peek()]){
                s.push(i++);
            }
            // curr < top
            else {
                int prev = s.pop();
                if (s.empty()){
                    max = Math.max(max, hist[prev] * (i));
                }else if ( hist[s.peek()] < hist[prev] ){
                    max = Math.max(max, hist[prev] * (i -  (s.peek() + 1)));
                }
            }
        }

        while(!s.empty()){
            int prev = s.pop();
            if (s.empty()){
                max = Math.max(max, hist[prev] * (i ));
            }
            else if (hist[s.peek()]< hist[prev]){
                max = Math.max(max, hist[prev] * (i -  (s.peek() + 1)));
            }
        }
        return max;
    }


    // Driver program to test above function
    public int largestRectangleArea(int[] hist)
    {
        return getMaxArea(hist, hist.length);
    }

    public int maximalRectangle(char[][] matrix) {
        
        int rowSize = matrix.length;
        if (rowSize == 0 ) return 0;
        int colSize = matrix[0].length;

        int[][] intMatrix = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                intMatrix[i][j] = Character.getNumericValue(matrix[i][j]);
            }
        }
        int max = 0;
        int[] hist = new int[colSize];
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {  
                int v = intMatrix[row][col];
                if ( v == 0){
                    hist[col] = 0;
                }else {
                    hist[col] += v;
                }
                // last col
                if (col == colSize-1){
                    max = Math.max(max, largestRectangleArea(hist));
                }
            }
        }
        return max;
    }
}