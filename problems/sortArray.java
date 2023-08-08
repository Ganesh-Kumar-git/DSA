package problems;

public class sortArray {
    public static void main(String[] args) {
        int [] nums={3,4,5,1,2};
        System.out.println(check(nums));
    }
    public static  boolean check(int[] nums) {
        //if (nums[0]<nums[nums.length-1]) return true;
        int max=0;
        if(nums[0]>nums[nums.length-1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    max++;
                }
            }
        }
        else{
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    max++;
                    }
                }
            }
        if(max==0 || max==1) return true;
        return false;



//        int max=0;
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]>nums[i+1]){
//                max++;
//            }
//        }
//        if(max==1) return true;
//        return false;
    }
}
