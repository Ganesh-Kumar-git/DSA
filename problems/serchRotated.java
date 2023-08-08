package problems;

public class serchRotated {
    public static void main(String[] args) {
        int [] nums={5,1,3};
        System.out.println(search(nums,2));
    }
    public static int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>=nums[0]){
                if(nums[low]<= target && target <=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid] <= target && target <= nums[nums.length-1] ){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
}
