package problems;

public class sortColurs {
    public static void main(String[] args) {
        int [] arr={2,0,1};
        sortColors(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            switch(nums[mid]) {
                case 0: {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(nums, mid, high);
                    high--;
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr1, int i, int j) {
        int temp=arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=temp;
    }
}
