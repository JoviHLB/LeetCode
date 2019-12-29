package test27;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        int []nums = {3,2,2,3};
        System.out.println(removeElement(nums,2));
        int []array = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(array,2));
    }
    public int removeElement(int []nums,int val) {
        int i = 0;
        for (int j=0; j<nums.length; j++) {
            if(nums[j]==val) continue;//如果该位置为目标值，跳过本轮循环
            nums[i]=nums[j];
            i++;
        }
        return i;
    }
}
