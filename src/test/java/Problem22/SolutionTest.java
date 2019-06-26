package Problem22;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();
    @Test
    void generateParenthesis() {
        List<String> ans = s.generateParenthesis(3);
        System.out.println(Arrays.toString(ans.toArray()));
    }
}