package Problem78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Backtrack
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}


// Iterative
/*
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList());

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> lastList = ans.stream().collect(Collectors.toList());
            for (List<Integer> l:lastList) {
                List<Integer> tmp = new ArrayList<>();
                tmp.addAll(l);
                tmp.add(nums[i]);
                ans.add(tmp);
            }
        }
        return ans;
    }
}*/
