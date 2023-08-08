package problems;

public class toeplitz {
    public static void main(String[] args) {
        int [][]m1={
                {1,2,3,5},
                {5,1,2,3},
                {9,5,12,2}
        };
        System.out.println(isToeplitzMatrix(m1));
    }

    public static boolean isToeplitzMatrix(int[][] m1) {
//        int rows=;
//        int cols=m1[0].length;
        for(int r=0;r<m1.length-1;r++){
            for(int c=0;c<m1[r].length-1;c++){
                if(m1[r][c]!=m1[r+1][c+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
