package test69;

import org.junit.Test;
//平方根
public class Solution {
    @Test
    public void test() {
        System.out.println(mySqrt(8));
    }
    public int mySqrt(int x) {
        if(x==0) return 0;
        int left = 1;
        int right  = x>>1;
        while(left < right) {
            int middle = (left+right+1)>>1;
            if(middle > x/middle) right=middle-1;
            else left=middle;
        }
        return left;
    }
}
