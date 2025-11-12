package DSA.DSAProblems;

import java.util.Arrays;

class missingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;

       
        
        int s=n*(n+1)/2;
        int total=0;
        total= Arrays.stream(nums).sum();

        return s-total;

    }
}