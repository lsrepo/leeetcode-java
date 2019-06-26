package Problem46;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void permute() {
        int[] input = {1,2,3};
        List<List<Integer>> result = s.permute(input);

        System.out.println("result.size() = " + result.size());
        for (List<Integer> row: result){
            System.out.println(Arrays.toString(row.toArray()));
        }
    }
}