package problems;

public class nQueens {
    public static int count=0;
    public static void main(String[] args) {
        System.out.println(totalNQueens(3));

    }

    public static int totalNQueens(int n) {
        boolean board[][]=new boolean[n][n];
        nQueens(5,0,0,board,count,0);
        return count;
    }
    public static void nQueens(int n,int row,int col,boolean [][] board,int output,int qpsf){
        if(qpsf==n){
            count+=output;
            return;
        }
        if(col==n){
            row++;
            col=0;
        }
        if(row==n){
            return;
        }
        if(isCheck(row,col,board)){
            board[row][col]=true;
            nQueens(n,row+1,0,board,1,qpsf+1);
            board[row][col]=false;
        }
        nQueens(n,row,col+1,board,output,qpsf);

    }

    public static boolean isCheck(int row,int col,boolean board [][]) {
        int r=row-1;
        int c=col;
        while(r>=0){
            if(board[r][c]){
                return false;
            }
            r--;
        }
        r=row-1;
        c=col+1;
        while(r >=0 && c<board.length ){
            if(board[r][c]){
                return false;
            }
            r--;c++;
        }
        r=row-1;
        c=col-1;

        while(r >=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;c--;
        }
        return true;
    }


}
