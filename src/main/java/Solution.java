import java.lang.reflect.Array;
import java.util.*;

/**
 * TODO: Try to use heap
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num:nums) {
            int count = map.get(num) == null ? 0 : map.get(num);
            map.put(num, count + 1);
        }

        int[][] pairs = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            pairs[i] = new int[] { entry.getKey(), entry.getValue()};
            i++;
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> 0 - a[1]));

        List<Integer> ans = new ArrayList<>();
        i = 0;
        for (; i < k; i++) {
            ans.add(pairs[i][0]);
        }

        new  PriorityQueue<Integer>();
        return ans;
    }
}