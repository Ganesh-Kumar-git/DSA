package problems;

public class flipingAnImage {
    public static void main(String[] args) {
        int m1 [][]={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        flipAndInvertImage(m1);
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [][] flipAndInvertImage(int[][] image) {
        int ans [][]=new int [image.length][image[0].length];
        for(int r=0;r<image.length;r++) {
                int c=0,cr=image[0].length-1;
                while (c <= cr) {
                    int temp = 0;
                    temp = image[r][c] == 0 ? 1 : 0;
                    ans[r][c] = image[r][cr] == 0 ? 1 : 0;
                    ans[r][cr] = temp;
                    c++;
                    cr--;
                }
            }
        return ans;
        }
    }

