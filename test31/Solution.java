package test31;

import org.junit.Test;

import java.util.Arrays;
//下一个排列
public class Solution {
    @Test
    public void test() {
        int []nums={1,2,3};
        nextPermutation(nums);
    }
    public void nextPermutation(int[] nums) {
        int i,j;
        int mark=0;
        for(i=nums.length-1;i>0;i--) {
            j=i-1;
            if(nums[i]>nums[j]) {
                Arrays.sort(nums,i,nums.length);
                for(int k=i;k<nums.length;k++) {
                    if(nums[k]>nums[j]) {
                        int tmp=nums[k];
                        nums[k]=nums[j];
                        nums[j]=tmp;
                        break;
                    }
                }
                mark=1;
            }
            if(mark==1) break;
        }
        if(i==0) Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
