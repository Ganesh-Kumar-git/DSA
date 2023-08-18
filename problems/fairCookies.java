package problems;

import java.util.ArrayList;

public class fairCookies {
    public static void main(String[] args) {
        int [] cookies={8,15,10,20,8};
        System.out.println(distributeCookies(cookies,2));;
    }
    public static int distributeCookies(int[] cookies, int k) {

        int j=0,z=0;
        int [] child=new int[k];
        ArrayList<Integer> ans=new ArrayList<>();
        helper(cookies,k,j,0,child,ans);
        int min=Integer.MAX_VALUE;
        for(int x:ans){
            if(x<min) min=x;
        }
        System.out.println(ans);
        return min;
    }
    public static void helper(int[] cookies, int k,int j,int i,int [] child,ArrayList<Integer> ans){
            if(cookies.length==j){
                int max=0;
                for(int x:child){
                    if(x>max) max=x;
                }
                ans.add(max);
                return;
            }
            if(i==k-1) i=0;
            while(i<k){
                child[i]+=cookies[j];
//                if(i==k-1 && ) i=k-2;
                helper(cookies,k,j+1,i,child,ans);
                child[i]-=cookies[j];i++;
            }


    }
}