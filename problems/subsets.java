package problems;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        List<List<Integer>> res=new ArrayList<>();
        subsetGenerator(0,nums,res,new ArrayList<>());
        System.out.println(res);

    }
    public static void subsetGenerator(int index, int [] nums, List<List<Integer>> res,List<Integer> cur ){
        if(index==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[index]);
        subsetGenerator(index+1,nums,res,cur);
        cur.remove(cur.size()-1);
        subsetGenerator(index+1,nums,res,cur);
    }
}
