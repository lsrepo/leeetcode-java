package Problem70;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void climbStairs() {
        Solution solution = new Solution();

        assertEquals(solution.climbStairs(2),2);
        assertEquals(solution.climbStairs(3),3);
    }

    @Test
    public  void division(){
        assertEquals(1, 1/2);
    }
}