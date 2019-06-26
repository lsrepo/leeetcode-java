package Problem49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str:strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            List<String> current = map.getOrDefault(sorted, new ArrayList<>());
            current.add(str);

            map.put(sorted, current);
        }

        return map.values().stream().collect(Collectors.toList());
    }
}