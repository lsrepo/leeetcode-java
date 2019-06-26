package Problem22;

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
//        System.out.println("\nn = " + n);
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; c++){
//                System.out.println("c = " + c);
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c)){
                        System.out.println();
                        System.out.println("c = " + c);
                        System.out.println("n-1-c = " + (n-1-c));
                        System.out.println("left = " + left);
                        System.out.println("right = " + right);
                        ans.add("(" + left + ")" + right);
                    }
            }
        }

        return ans;
    }
}

//public class Solution {
//        public boolean isValid(String str){
//        int left = 0;
//        int right = 0;
//        int i = 0;
//        while (i<str.length()){
//            char c = str.charAt(i);
//            if (c == '('){
//                left++;
//            }else{
//                right++;
//            }
//            if ( !(left >= right)){
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//
//    public List<String> generateParenthesis(int n) {
//        Set<String> ans = new HashSet<>();
//        ans.add("");
//
//        int i = 0;
//        while (i < n){
//            Set<String> last = new HashSet<>();
//            last.addAll(ans);
//            ans.clear();
//
//            Set<String> newItems = new HashSet<>();
//            for (String str:last) {
//                newItems.add(str + "()");
//                newItems.add("(" + str + ")");
//                newItems.add("()" + str);
//            }
//
//            for (String item: newItems){
//                if (isValid(item)){
//                    ans.add(item);
//                }
//            }
//            i++;
//        }
//
//        return ans.stream().collect(Collectors.toList());
//    }
//}

//public class Solution {
//    public List<String> generateParenthesis(int n) {
//        Set<String> ans = new HashSet<>();
//        Set<String> seen = new HashSet<>();
//        int i = 0;
//        String options = "";
//
//        while (i < n) {
//            options += "(";
//            options += ")";
//            i++;
//        }
//
//        int[] used = new int[n*2];
//        generateParenthesis(options,"", ans,seen, used);
//        System.out.println(Arrays.toString(ans.toArray()));
//        return ans.stream().collect(Collectors.toList());
//    }
//
//    public void generateParenthesis(String options, String str, Set<String> ans,Set<String> seen, int[] used){
//        if (seen.contains(str)){
//            return;
//        }
//        seen.add(str);
//        System.out.println("str = " + str);
//        if (str.length() > options.length()){
//            return;
//        }
//        if (!isValid(str)){
//            return;
//        }
//        if (str.length() == options.length()){
//            ans.add(str);
//            return;
//        }
//        for (int i = 0; i < options.length(); i++) {
//            if (used[i] == 1){
//                continue;
//            }
//            used[i] = 1;
//            str += options.charAt(i);
//            generateParenthesis(options, str, ans, seen , used);
//            used[i] = 0;
//            str = str.substring(0,str.length()-1);
//        }
//    }
//
//    public boolean isValid(String str){
//        int left = 0;
//        int right = 0;
//        int i = 0;
//        while (i<str.length()){
//            char c = str.charAt(i);
//            if (c == '('){
//                left++;
//            }else{
//                right++;
//            }
//            if ( !(left >= right)){
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }
//}
