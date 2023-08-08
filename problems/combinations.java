package problems;

import java.util.ArrayList;
import java.util.List;

public class combinations {
    public static void main(String[] args) {
//        int [] arr={1,2,3,4};
        List<List<Integer>> res=new ArrayList<>();
        combinations(2,1,4, new ArrayList<>(),res);
        System.out.println(res);
    }
    public static void combinations(int k,int start,int end,List<Integer> cur,List<List<Integer>> res){
        if(cur.size()==k){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=start;i<=end;i++){
            cur.add(i);
            combinations(k,i+1,end,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}
