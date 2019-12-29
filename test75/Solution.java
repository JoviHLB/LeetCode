package test75;

import org.junit.Test;

import java.util.Arrays;

//颜色分类
public class Solution {
//原地算法
    @Test
    public void test() {
        int []nums={2,0,2,1,1,0};
        sortColors(nums);
    }
    public void sortColors(int[] nums) {
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<1) count1++;
            if(nums[i]==1) count2++;
        }
        for(int i=0;i<nums.length;i++) {
            if(count1!=0) {
                nums[i]=0;
                count1--;
            }
            else if(count2!=0) {
                nums[i]=1;
                count2--;
            }
            else nums[i]=2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
