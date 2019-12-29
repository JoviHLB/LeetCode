package test53;

import org.junit.Test;


public class Solution {
    @Test
    public void test() {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        int result=nums[0],sum=0;
        for (int num:nums) {
            if(sum>0) sum+=num;
            else sum=num;//↑若sum(某个num)<0直接可以跳过,<0没增益效果
            result= Math.max(result,sum);
        }
        return result;
    }
}
