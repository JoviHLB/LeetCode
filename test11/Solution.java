package test11;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        int []height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public int maxArea(int[] height) {
        int result=0;
        int start=0;
        int end=height.length-1;
        while (start<end) {
            result=Math.max(result,Math.min(height[start],height[end])*(end-start));
            if(height[start]>=height[end]) end--;
            else start++;
        }
        return result;
    }
}
