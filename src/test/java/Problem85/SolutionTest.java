package Problem85;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s = new Solution();
    @Test
    public void getMaxArea() {

        char[][] input = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        Assert.assertEquals(6,s.maximalRectangle(input));
    }
    @Test
    public void getMaxArea2() {

        char[][] input = {
                {'1','0'}
        };
        Assert.assertEquals(1,s.maximalRectangle(input));
    }
}