package Problem406;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.comparingInt;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();
    @Test
    void reconstructQueue() {
        int[][] people = {
                {7,0},
                {4,4},
                {7,1},
                {5,0},
                {6,1},
                {5,2},
        };

        int[][] output = s.reconstructQueue(people);

        for (int[] p:output) {
            System.out.println(Arrays.toString(p));
        }
    }


    @Test
    void testSort() {

        int[][] people = {
                {7,2},
                {4,3},
                {7,0},
                {7,1},
                {4,1},
        };

        Arrays.sort(people, Comparator.<int[]>comparingInt(a -> 0 - a[0]).thenComparingInt(a -> a[1]));

        for (int[] p:people) {
            System.out.println(Arrays.toString(p));
        }
    }

    @Test
    void testArrayInsert(){
        ArrayList<Integer> list = new ArrayList();
        list.add(0, 7);
        list.add(1, 7);
        list.add(1, 6);

        System.out.println("list= " + Arrays.toString(list.toArray()));
    }
}