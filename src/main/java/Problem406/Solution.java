package Problem406;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length < 2){
            return people;
        }
        Arrays.sort(people, Comparator.<int[]>comparingInt(a -> 0 - a[0]).thenComparingInt(a -> a[1]));

        ArrayList<int[]> list = new ArrayList<>();

        for (int[] person: people) {
            list.add(person[1], person);
        }

        for (int i = 0; i < people.length; i++) {
            people[i] = list.get(i);
        }

        return people;
    }
}