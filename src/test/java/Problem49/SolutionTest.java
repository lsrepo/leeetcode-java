package Problem49;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    void groupAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] output = {
            {"ate","eat","tea"},
            {"nat","tan"},
            {"bat"}
        };

        List<List<String>> actual = s.groupAnagrams(input);

        System.out.println("actual.size() = " + actual.size());
        for (List<String> line: actual){
            System.out.println(Arrays.toString(line.toArray()));
        }
        boolean equality = Arrays.asList(output).equals(actual);
        Assertions.assertTrue(equality);
    }
}