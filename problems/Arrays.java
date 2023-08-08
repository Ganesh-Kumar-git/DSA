package problems;

public class Arrays {

    public static void main(String[] args) {
        int [] arr={1,2,3,6,4};
//        System.out.println(arrDuplicat(arr));
        System.out.println();
        }
    public static boolean arrDuplicat(int [] arr){
        int count=0;
        for(int j =0;j<arr.length;j++) {
            for (int i=1;i<arr.length;i++) {
                if (arr[j]==arr[i]) {
                    count++;
                }
            }
        }
        if(count == arr.length-1){
            return false;
        }
        else{
        return true; }
}
}
