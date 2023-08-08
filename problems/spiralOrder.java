package problems;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public static void main(String[] args) {
        int m1[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(spiralMatrix(m1));
    }

    public static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> x=new ArrayList<>();
        int left=0,top=0,right=matrix[0].length-1,bottom=matrix.length-1;
        while(left<=right && top<=bottom) {
            for (int i = left; i <=right; i++) {
                x.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom; i++) {
                x.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for (int i = right; i >= left; i--) {
                x.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    x.add(matrix[i][left]);
                }
            }
            left++;
        }
        return x;
    }
}
