package test7;

import org.junit.Test;

//整数反转
public class Solution {
    @Test
    public void test() {
        System.out.println(reverse(120));
    }
    public int reverse(int x) {
        //法一
        long y=0;
        while (x!=0) {
            y = y * 10 + x % 10;//反转后的整数
            x /= 10;
        }
        if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE) return 0;
        return (int)y;
        //法二(题解库)
//        StringBuilder str = new StringBuilder(x);
//        if (x == 0)
//            return 0;
//        StringBuilder s = new StringBuilder();
//        char[] num1 = "2147483647".toCharArray();
//        char[] num2 = "2147483648".toCharArray();
//        int num = x < 0 ? -x : x;
//        while (num != 0) {
//            s.append(num % 10);
//            num /= 10;
//        }
//        if (s.length() > 10)
//            return 0;
//        if (s.length() == 10) {
//            if (x > 0) {
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) - '0' > num1[i] - '0')
//                        return 0;
//                    else if (s.charAt(i) - '0' < num1[i] - '0')
//                        break;
//                }
//            } else {
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) - '0' > num2[i] - '0')
//                        return 0;
//                    else if (s.charAt(i) - '0' < num2[i] - '0')
//                        break;
//                }
//            }
//        }
//        return x < 0 ? Integer.parseInt("-" + s.toString()) : Integer.parseInt(s.toString());
    }
}
