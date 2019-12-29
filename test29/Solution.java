package test29;

import org.junit.Test;
//两数相除
public class Solution {
    @Test
    public void test() {
        System.out.println(divide(10,-3));
    }
    public int divide(int dividend, int divisor) {
        int result=0;
        int flag;
        if(dividend==0) return 0;
        if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        flag=(dividend>0?1:-1)*(divisor>0?1:-1);
        long dd=Math.abs((long)dividend);
        long dr=Math.abs((long)divisor);//防止被除数-2^31取绝对值超出int
        for(int i=31;i>=0;i--) {
            if(dd>>i>=dr) {
                result+=1<<i;
                dd-=dr<<i;
            }
        }
        return flag*result;
    }
}
