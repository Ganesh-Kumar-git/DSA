package problems;

import java.util.ArrayList;
import java.util.List;

public class palindromePartion {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(partition(s));
    }

    public static List<List<String>> partition(String s) {
        ArrayList<String> res = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        f(s, 0, ans, res);
        return ans;
    }

    public static void f(String s, int index, List<List<String>> ans, ArrayList<String> res) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(res));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (ispalindrome(s, index, i)) {
                res.add(s.substring(index, i+1));
                f(s, i+1, ans, res);
                res.remove(res.size() - 1);
            }
        }
    }

    public static boolean ispalindrome(String s, int x, int z) {
//        if (x == z) return true;
        while (x <= z) {
            if (s.charAt(x) != s.charAt(z)) {
                return false;
            }
            x++;
            z--;
        }
            return true;
    }
}
