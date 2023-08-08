package problems;

import java.util.Arrays;

public class boatpeople {
    public static void main(String[] args) {
        int limit=3;
        int m1[]={3,2,2,1};
        System.out.println(numRescueBoats(m1,limit));;
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans=0;
        int i=0,j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;ans++;
        }
        return ans;
    }
}
