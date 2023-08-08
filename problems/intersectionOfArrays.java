package problems;

import java.util.ArrayList;

public class intersectionOfArrays {
    public static void main(String[] args) {

        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        System.out.println(intersect(nums1,nums2));
    }
    public static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {
        int i=0,j=0,count=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while(i< nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]) {
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;j++;
            }
        }
        return ans;



    }
}
