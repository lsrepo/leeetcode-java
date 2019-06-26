package Problem46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        permute(permutations, new ArrayList<>(), nums);
        return permutations;
    }

    private void permute(List<List<Integer>> permutations, List<Integer> temp, int [] nums){
        if(temp.size() == nums.length){
            permutations.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])) {
                continue; // element already exists, skip
            }
            temp.add(nums[i]);
            permute(permutations, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }

//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>>  ans = new ArrayList<>();
//
//        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        recurse(numList, new ArrayList<>(), ans);
//        return ans;
//    }
//
//    public void recurse(List<Integer> remain, List<Integer> last, List<List<Integer>> ans){
//
//        if (remain.size() == 0){
//            ans.add(new ArrayList(last));
//            return;
//        }
//
//        for (Integer el:remain ) {
//            List<Integer> newRemain = new ArrayList();
//            newRemain.addAll(remain);
//            newRemain.remove(el);
//
//            last.add(el);
//            recurse(newRemain, last, ans);
//            last.remove(last.size()-1);
//        }
//
//    }
}