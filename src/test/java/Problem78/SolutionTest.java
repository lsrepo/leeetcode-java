package Problem78;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void subsets() {
        int[] input = {1,2,3,4};
        List<List<Integer>> l = s.subsets(input);

        for (List<Integer> line: l) {
            System.out.println(Arrays.toString(line.toArray()));
        }
    }
}