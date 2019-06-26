package Problem139;

import java.util.HashSet;
import java.util.List;


/**
 * Top-down
 */
//public class Solution {
//    // divide s in to smaller string
//    public boolean wordBreakHelper(String s,HashSet<String> wordSet,Boolean[] memo,int j) {
//        // touching end of string -> Done
//        if (s.length() == 0) {
//            return true;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            String substring = s.substring(0, i + 1);
//            System.out.println("up substring = " + substring);
//            boolean isSubstringInDict = wordSet.contains(substring);
//
//            if (!isSubstringInDict){
//                continue;
//            }
//
//            if (memo[i+1+j] == null){
//                memo[i+1+j] = wordBreakHelper(s.substring(i+1), wordSet,memo,i);
//            }
//
//            if (memo[i+1+j]){
//                System.out.println("s = " + s);
//                System.out.println(i+1);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean wordBreak(String s, List<String> wordDict) {
//        HashSet<String> wordSet = new HashSet<>(wordDict);
//        Boolean[] memo = new Boolean[s.length() + 1];
//        if (s.length() == 0) {
//            return false;
//        }
//        boolean ans = wordBreakHelper(s, wordSet, memo,0);
//        for (int i = 0; i < memo.length; i++) {
//            System.out.println("%s = " + memo[i]);
//        }
//        return ans;
//    }
//}

//Bottom - up
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict){
        HashSet<String> wordSet = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length() + 1];
        int lastCut = s.length();
        for (int i = s.length()-1; i >= 0 ; i--) {
            String sub = s.substring(i,lastCut);
            if (wordSet.contains(sub)){
                if ((i + sub.length()) > (s.length()-1 )  || memo[i + sub.length()]  ){
                    memo[i] = true;
                    lastCut = i;
                }
            }
        }
        return memo[0] != null && memo[0] ==  true;
    }
}