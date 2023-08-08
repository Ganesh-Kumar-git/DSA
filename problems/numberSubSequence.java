//package problems;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class numberSubSequence {
//    public static void main(String[] args) {
//        int [] arr={3,3,6,8};
//        int target=10;
//        System.out.println(numSubseq(arr,target));
//    }
//    public static int numSubseq(int[] nums, int target) {
//        int count=0;
//        ArrayList<Integer> sum=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            int j=i;
//            while(j<nums.length){
//                sum.add(nums[j]);
//                sum.sort();
//                if(Math.max(sum<=target){
//                    count++;j++;
//                }
//                else break;
//            }
//        }
//        return count;
//
//    }
//}
