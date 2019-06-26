package Problem84;

import java.util.Stack;

public class Solution
{
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
}

//class Solution {
//    public int largestRectangleArea(int[] heights) {
//        int max = 0;
//        // loop through each element
//        for (int i = 0; i < heights.length ; i++) {
//            int curr = heights[i];
//            if (i>0){
//                int ex = heights[i-1];
//                if (curr == ex){
//                    continue;
//                }
//            }
//
//
//            int count = 1;
//
//            // scan lhs
//            for (int j = i - 1; j >= 0 ; j--) {
//                int lhs = heights[j];
//                if (lhs < curr){
//                    break;
//                }
//                count += 1;
//            }
//            // scan rhs
//            for (int j = i+1; j < heights.length ; j++) {
//                int rhs = heights[j];
//                if (rhs < curr){
//                    break;
//                }
//                count += 1;
//            }
//            max = Math.max(max, count * curr);
//
//        }
//        return max;
//    }
//}

