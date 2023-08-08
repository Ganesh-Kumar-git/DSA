package problems;

public class ticTacToe {
    public static void main(String[] args) {
        int m1[][] = {
                {0, 0},
                {1, 1},
                {0, 1},
                {0, 2},
                {1, 0},
                {2,0}
        };
        System.out.println(tictactoe(m1));;
    }

    public static String tictactoe(int[][] moves) {
//        char matrix[][] = new char[3][3];
        int a[]=new int[8];
        int b[]=new int[8];
        int count=0;
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0){
                count++;
                if(moves[i][0] == moves[i][1]){
                    a[6] += 1;
                }
                a[moves[i][0]] += 1;
                a[moves[i][1]+3] += 1;
                if ((moves[i][0]==0 && moves[i][1]==2) || (moves[i][0]==1 && moves[i][1]==1) || (moves[i][0]==2 && moves[i][1]==0) ) {
                    a[7]+=1;
                }
            }
            else {
                count++;
                if (moves[i][0] == moves[i][1]) {
                    b[6] += 1;
                }
                if ((moves[i][0]==0 && moves[i][1]==2) || (moves[i][0]==1 && moves[i][1]==1) || (moves[i][0]==2 && moves[i][1]==0) ) {
                    b[7]+=1;
                }
            b[moves[i][0]] += 1;
            b[moves[i][1]+3] += 1;
            }
            }
//        for(int arr:a){
//            System.out.print(arr);
//        }
//        System.out.println();
//        for(int arr:b){
//            System.out.print(arr);
//        }
        for(int i=0;i<a.length;i++){
            if(a[i]==3) return "A";
        }
        for(int i=0;i<b.length;i++){
            if(b[i]==3) return "B";
        }
        return 9!=count?"Pending":"Draw";
        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        return 'A';


    }

