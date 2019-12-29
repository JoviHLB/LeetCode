package test55;

import org.junit.Test;
//跳跃游戏
public class Solution {
    @Test
    public void canJump() {
        int[] nums={2,3,1,4};
        System.out.println(canJump(nums));;
    }
    public boolean canJump(int []nums) {
        return doJudge(nums);
    }
    public boolean doJudge(int []nums) {
        if(nums.length==1) return true;
        int right=nums.length-1;
        int left=right-1;
        while(left>=0) {
            if(nums[left]>=(right-left))
                right=left;
            left--;
        }
        return right==0;
    }
}
