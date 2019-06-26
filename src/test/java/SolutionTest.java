import Problem48.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();
    @Test
    void rotate() {
        // Arrange

        int[][] input = {
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };

        int[][] expected = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };

        // Act
        s.rotate(input);
        // Assert
        for (int[] line:input) {
            System.out.println(Arrays.toString(line));;
        }
        Assertions.assertTrue(Arrays.deepEquals(expected,input));
        Assertions.assertEquals(1, 3/2);
    }
}