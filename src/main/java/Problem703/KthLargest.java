package Problem703;

import java.util.*;

class KthLargest {

    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.q = new PriorityQueue<>(k);
        for (int num: nums){
            add(num);
        }
    }

    public int add(int val) {
        if (q.size() < this.k){
            q.add(val);
        } else if (val > q.peek()) {
               q.poll();
               q.add(val);
        }
        return q.peek();
    }


}