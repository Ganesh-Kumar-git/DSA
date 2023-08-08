package problems;

public class peakElement {
    public static void main(String[] args) {
        int [] nums={3, 1,4};
        System.out.println(findPeakElement(nums,1));;
    }

    public static  int findPeakElement(int[] A,int B) {
        int s=0,end=A.length-1;
        while(s<end){
            int mid=(s+end)/2;
            if(A[mid]==B) return mid;
            if(A[mid+1]>A[mid]) end=mid;
            else s=mid+1;
        }
        return -1;
    }
}
