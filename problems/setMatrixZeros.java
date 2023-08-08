package problems;

public class setMatrixZeros {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 0, 2},
                {3, 4, 5},
                {1, 3, 1}
        };
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void setZeroes(int[][] matrix) {
        int col0 = 1, col = matrix[0].length, row = matrix.length;
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < col; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;

        }
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 1; j--)
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            if(col==0)matrix[i][0]=0;
        }
    }
}

