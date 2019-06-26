package Problem84;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void largestRectangleArea_test1() {
        int[] arr = {2, 1, 5, 6, 2, 3};
        assertEquals(10,solution.largestRectangleArea(arr));
    }

    @Test
    public void largestRectangleArea_test3() {
        int[] arr = {1, 2, 3, 2, 2};
        assertEquals(8,solution.largestRectangleArea(arr));
    }

    @Test
    public void largestRectangleArea_test2() {
        int[] arr = {2, 2, 2, 2};
        assertEquals(8,solution.largestRectangleArea(arr));
    }


    @Test
    public void largestRectangleArea_test4() {
        int[] arr = {1,0};
        assertEquals(1,solution.largestRectangleArea(arr));
    }

    @Test
    public void largestRectangleArea_test5() {
        int[] arr = {0,2,0};
        assertEquals(2,solution.largestRectangleArea(arr));
    }
}