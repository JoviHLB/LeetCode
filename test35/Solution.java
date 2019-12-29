package test35;

import org.junit.Test;

//搜索插入位置
public class Solution {
    @Test
    public void test() {
        int []nums={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));
        target=2;
        System.out.println(searchInsert(nums,target));
        target=7;
        System.out.println(searchInsert(nums,target));
        target=0;
        System.out.println(searchInsert(nums,target));
        int []array={1,3,5};
        target=4;
        System.out.println(searchInsert(array,target));

    }
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (nums[len - 1] < target) {//此if语句可有可无
            return len;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;//while结束left>right;将插入的位置锁定left,若是讲返回小于它的最大的即要返回right
    }
}
