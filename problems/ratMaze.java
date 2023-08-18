package problems;
import java.util.*;
public class ratMaze {
    public static void main(String[] args) {
        int  m[][] = {{1, 1},
                {1, 1},
                };
        System.out.println(findPath(m,2));
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        if(m[n-1][n-1]==0) {
            ans.add("-1");
            return ans;
        }
        int i=0,j=0;
        helper(m,i,j,"",n,ans);
        return ans;

        }

    public static void helper(int[][] m, int i, int j,String res,int n,ArrayList<String> ans) {
        if (i == n && j == n ) {
            ans.add(res);
            return;
        }
        if (j >= n) {
            i = i + 1;
            j = 0;
        }
        if (i < n - 1 && j < n && m[i + 1][j] == 1) {
            m[i + 1][j] = -1;
            helper(m, i + 1, j, res + "D", n, ans);
            m[i + 1][j] = 1;
        }
        if (i >0 && j > 0 && m[i][j - 1] == 1) {
            m[i][j - 1] = -1;
            helper(m, i, j - 1, res + "L", n, ans);
            m[i][j - 1] = 1;
        }
        if (i < n && j < n - 1 && m[i][j + 1] == 1) {
            m[i][j + 1] = -1;
            helper(m, i, j + 1, res + "R", n, ans);
            m[i][j + 1] = 1;
        }
        if (i < 0 && j < n && m[i - 1][j] == 1) {
            m[i - 1][j] = -1;
            helper(m, i - 1, j, res + "U", n, ans);
            m[i - 1][j] = 1;
        }
    }
}

