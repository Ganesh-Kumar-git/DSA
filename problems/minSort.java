package problems;

public class minSort {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        if(nums[nums.length-1] >= nums[0]) return nums[0];
        int low=0,high=nums.length-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>=nums[0]){
                low=mid+1;
            }
            else{
                if(nums[mid]<nums[mid-1]) return nums[mid];
                high=mid-1;
            }
        }
        return nums[mid];
    }
}
