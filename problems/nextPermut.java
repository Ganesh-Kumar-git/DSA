package problems;

public class nextPermut {

    public static void main(String[] args) {
        int m1 []={1,3,2};
        nextPermutation(m1);
        for(int x:m1){
            System.out.print(x);
        }
    }

    public static void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i] > nums[i+1]){
            i--;
        }
        if(i>0) {
            int j=nums.length-1;
            while(nums[j]<nums[j]) {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i);
    }
    public static void swap(int [] nums,int i,int j){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int nums[],int i){
        int x=nums.length-1;
        while(i<=x){
            int temp=0;
            temp=nums[i];
            nums[i]=nums[x];
            nums[x]=temp;
            i++;x--;
        }
    }
}
