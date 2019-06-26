import org.junit.Test;
import static org.junit.Assert.*;

public class Problem1046Test {

    @Test
    public void lastStoneWeight() {
        int[] stones = {2,7,4,1,8,1};
        int answer = Problem1046.lastStoneWeight(stones);
        assertEquals(answer, 1);
    }
}