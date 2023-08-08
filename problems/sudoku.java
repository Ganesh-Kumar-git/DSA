package problems;

public class sudoku {
    public static char board [] []={
            {'5','3','.','.','7','.','.','.','.'} ,
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
    };
    public static void main(String[] args) {
//        char board[][]=board;
        System.out.println(solveSudoku(board,0,0));
        for(int x=0;x<board.length;x++){
            for(int y=0;y<board.length;y++){
                System.out.print(board[x][y]+" ");
            }
            System.out.println();
        }
    }
    public static boolean solveSudoku(char [][] board,int row,int col){
        if(row==board.length){
            return true;
        }
        if(col==board.length){
            return solveSudoku(board,row+1,0);
        }

        if(board[row][col]=='.'){
            for(int i=1;i<10;i++) {
                if (isCheck(board,row,col,i)) {
                    board[row][col]=(char)(i+'0');
                    boolean r=solveSudoku(board, row,col+1);
                    if(r) return true;
                    board[row][col] = '.';
                }
            }
            return false;
//          solveSudoku(board, row,col+1);
        }
        else{
            return solveSudoku(board, row,col+1);
        }

    }

    public static boolean isCheck(char [][] board,int row,int col,int v) {
        //for columns
        int r=row;
        int c=0;
        while(c<9 && r>=0){
            if(board[r][c] ==(char)(v+'0')){
                return false;
            }
            c++;
        }
        r=0;
        c=col;
        while(r<9 && c>=0 ){
            if(board[r][c]==(char)(v+'0')){
                return false;
            }
            r++;
        }
        r=3*(int) Math.floor(row/3);
        c=3*(int) Math.floor(col/3);

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==(char)(v+'0')) return false;
            }
        }
        return true;
    }
}
