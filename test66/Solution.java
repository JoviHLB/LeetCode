package test66;

import org.junit.Test;

import java.util.Arrays;
//加一
public class Solution {
    @Test
    public void test() {
        int []nums = {8,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
    public int[] plusOne(int[] digits) {
        for (int j=digits.length-1; j>=0; j--) {
            digits[j]++;
            digits[j]=digits[j]%10;
            if(digits[j]!=0) return digits;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
