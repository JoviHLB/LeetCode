package test26;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        int []nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        int []array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));
    }
    public int removeDuplicates(int []nums) {
        if(nums.length==0) return 0;
        int i = 0;
        for (int j=1; j<nums.length; j++) {
            if(nums[j]!=nums[i]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
