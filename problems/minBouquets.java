package problems;
import java.util.Arrays;

public class minBouquets {
    public static void main(String[] args) {
        int[] bloomDay={1,10,3,10,2};
        System.out.println(minDays(bloomDay,3,2));;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k) return -1;
            int low=m,high=0,ans=0;
            for(int x:bloomDay){
                high=Math.max(high,x);
            }
            while(low<=high){
                int mid=(low+high)/2;
                if(isBloom(bloomDay,m,k,mid)){
                    ans=mid;
                    high=mid-1;
                }
                else low=mid+1;
            }//Tony stark
            return ans;
    }

    private static boolean isBloom(int[] bloomDay, int m, int k, int mid) {
        int holder=0;
        for(int i=0;i<bloomDay.length;i++){
            if( bloomDay[i] <= mid){
                holder++;
                if(holder==k) {
                    m--;holder=0;
                }
            }
            else{
                holder=0;
            }

        }
        if(m<=0) return true;
        return false;
    }
}
