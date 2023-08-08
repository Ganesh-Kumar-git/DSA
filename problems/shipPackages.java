package problems;
public class shipPackages {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,5));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low=weights[0];
        int high=0,ans=0,ship=0;
        for (int x:weights){
            high+=x;
        }
        while(low<=high) {
            int mid=(low+high)/2;
            if(helper(weights, days,mid,ship)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    private static boolean helper(int[] weights, int days, int capacity,int ship) {
        int j=0,holder=0;
        while(j<days){
            ship=0;
            for(int i=holder;i<weights.length;i++){
                if(ship+weights[i]<=capacity){
                    ship+=weights[i];
                    holder=i;
                    if(holder==weights.length-1) return true;
                }
                else{
                    holder=i;
                    break;
                }
            }
//            if(holder+1 == weights.length) return true;
            j++;
        }
        //if(holder+1== weights.length)return true;
        return false;
    }
}
