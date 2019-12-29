package test9;

import org.junit.Test;

//回文数
public class Solution {
    @Test
    public void test() {
        System.out.println(isPalindrome(-321));
        System.out.println(isPalindrome(96369));
        System.out.println(isPalindrome(41451));//false
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y=0;
        int tmp=x;
        while (tmp!=0) {
            y=y*10+tmp%10;//反转后的整数
            tmp/=10;
        }
        return y==x;
    }
}
