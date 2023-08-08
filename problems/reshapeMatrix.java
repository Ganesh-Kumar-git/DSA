package problems;

public class reshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 2, c = 4;
        int[][] res = matrixReshape(mat, r, c);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(m*n!=r*c) return mat;
        if(m==r && n==c) return mat;
        int n_position=0,o_position=0;
        int ans [][]=new int[r][c];
        while(n_position<r*c && o_position<m*n){
            ans[n_position/c][n_position%c]=mat[o_position/n][o_position%n];
            n_position++;o_position++;
        }
        return ans;
    }
}
