package problems;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int [] arr={0,1,2,2,3,0,4,2};
        int k=2;
        System.out.println(removeElement(arr,k));
    }
    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int x=0;
        for(int a=0;a<nums.length;a++){
            if(nums[a]==val){
                nums[a]=200;
                x++;
            }
        };
        Arrays.sort(nums);
        return x;
    }
}
