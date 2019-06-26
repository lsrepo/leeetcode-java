package Problem39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void s() {
//        Set<List<Integer>> intList = new HashSet<>();

        int[] a = {2,3,2};
        int[] b = {2,2,3};

        Arrays.sort(a);
        Arrays.sort(b);


        Assertions.assertArrayEquals(a,b);
    }
}