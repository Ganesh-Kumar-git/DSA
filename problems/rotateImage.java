package problems;

public class rotateImage {
    public static void main(String[] args) {
        int m1[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(m1);
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1.length;j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
            }
    }

    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<=matrix.length-1;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int r=0;r<matrix.length;r++){
            int i=0,j=matrix.length-1;
            while(i<j){
                int temp=0;
                temp=matrix[r][i];
                matrix[r][i]=matrix[r][j];
                matrix[r][j]=temp;
                i++;j--;
            }
        }
    }
}
