package Problem139;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wordBreakTest1() {
        Solution s = new Solution();
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        boolean actual = s.wordBreak("leetcode", list);
        assertTrue(actual);
    }

    @Test
    public void wordBreakTest2() {
        Solution s = new Solution();
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");
        boolean actual = s.wordBreak("applepenapple", list);
        assertTrue(actual);
    }

    @Test
    public void wordBreakTest3() {
        Solution s = new Solution();
        List<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");
        boolean actual = s.wordBreak("catsandog", list);
        assertTrue(!actual);
    }

    @Test
    public void wordBreakTest9() {
        Boolean[] arr = new Boolean[9];
        System.out.println("arr[2] = " + arr[2]);
        System.out.println(arr.length);
    }


    @Test
    public void wordBreakTest10() {
        String s = "catsandogs";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println(String.format("s.substring(%s, %s) = ", j , i + 1) + s.substring(j, i +1));
            }
        }
    }
}