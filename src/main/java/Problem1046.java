import java.util.Collections;
import java.util.PriorityQueue;

/**
 * This program involves 2 calculations.
 * 1. Create a heap
 *  - it processes n elements
 *  - it means n times of heapify needs to be done
 *  - thus, O(n x log n)
 * 2. Poll max
 *  - take the worst scenario, all elements equal
 *  - it means only 1 element get destroyed every time
 *  - the while-loop takes n times to complete
 *  - removing the max in a max heap is O(1)
 *  - thus, O(n)
 *
 * Complexity:
 *  - O(n x log n) is dominant
 *  - thus, O(n x log n)
 */
class Problem1046 {
    public static int lastStoneWeight(int[] stones) {
        // PriorityQueue's default implementation is a min heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Append elements to heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if (y !=x ){
                maxHeap.add(y-x);
            }
        }
        return maxHeap.size() == 0 ? 0 :maxHeap.poll();
    }
}
