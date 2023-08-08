package problems;

public class wavematrix {
    public static void main(String[] args) {
        int arr [][]= {
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,12}
        };
        System.out.println(1%2);

        for(int c=0;c<arr[0].length;c++){
            if(c%2==0){
                for(int r=0;r<arr.length;r++){
                    System.out.print(arr[r][c]+ " ");
                }
            }
            else{
                for(int r=arr.length-1;r>=0;r--){
                    System.out.print(arr[r][c] + " ");
                }
            }

        }

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
    }
}
