package Problem703;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestTest {

    @Test
    public void test1() {
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(3, arr);
        assertEquals(kthLargest.add(3),4);   // returns 4
        assertEquals(kthLargest.add(5),5);   // returns 5
        assertEquals(kthLargest.add(10),5);  // returns 5
        assertEquals(kthLargest.add(9),8);   // returns 8
        assertEquals(kthLargest.add(4),8);   // returns 8
    }
}