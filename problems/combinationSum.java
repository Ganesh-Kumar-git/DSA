package problems;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList<>();
        int [] arr={2,3,6,7};
        combinations(arr,7,0,0,new ArrayList<>(),res);
        System.out.println(res);
    }
    public static void combinations(int [] nums,int target,int index,int holder,List<Integer> cur,List<List<Integer>> res){
        if(holder==target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(holder>target){
            return;
        }
        if(index>=nums.length){
            return;
        }
        cur.add(nums[index]);
        combinations(nums,target,index,holder+nums[index],cur,res);
        cur.remove(cur.size()-1);
       combinations(nums,target,index+1,holder,cur,res);


    }
}
