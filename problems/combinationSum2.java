package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class combinationSum2 {
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList<>();
        int [] arr={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        combinations(arr,8,0,0,new ArrayList<>(),res);
        System.out.println(res);
    }

    public static void combinations(int [] nums,int target,int index,int holder,List<Integer> cur,List<List<Integer>> res){
        if(holder==target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(holder>target || nums[index] > target){
            return;
        }
        if(index>=nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
           if(i>index && nums[i] == nums[i-1]) continue;
            cur.add(nums[i]);
            combinations(nums, target, i + 1, holder + nums[i], cur, res);
            cur.remove(cur.size()-1);
        }

    }
}


//if(cur.size()>1 && cur.get(cur.size()-1)==nums[index-1]) {
//        return;
//        }
//        cur.add(nums[index]);
//        combinations(nums, target, index + 1, holder + nums[index], cur, res);
//        cur.remove(cur.size()-1);
//        combinations(nums,target,index+1,holder,cur,res);
