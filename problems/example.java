package problems;
import java.util.Arrays;

public class example {
    public static int count=0;
//    public static void f(int x,int n,int i){
//        if(x==0){
//            count++;
//            return ;
//        }
//        if(i > (int)Math.floor(Math.sqrt(x))){
//            return;
//        }
//        f(x,n,i+1);
//        f(x- (int)Math.pow(i,n),n,i+1);
//
//    }
    public static void main(String[] args) {
//        f(10,2,1);
//        System.out.println(count);
        int arr [] ={1,2,3,4,6,7};
        System.out.println(Arrays.binarySearch(arr,5));
    }
}
