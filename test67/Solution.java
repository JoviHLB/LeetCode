package test67;

import org.junit.Test;
//二进制和
public class Solution {
    @Test
    public void test() {
        System.out.println(addBinary("1010","1011"));
    }
    public String addBinary(String a, String b) {
        int carry = 0;
        String str="";
        int i=a.length()-1;
        int j=b.length()-1;
        for(;i>=0||j>=0;i--,j--) {
            if(i>=0&&j>=0) {
                int temp=(a.charAt(i)-48)+(b.charAt(j)-48)+carry;
                carry=temp/2;
                str=temp%2+str;
            }
            else if(i>=0&&j<0) {
                int temp=(a.charAt(i)-48)+carry;
                carry=temp/2;
                str=temp%2+str;
            }
            else if(j>=0&&i<0) {
                int temp = (b.charAt(j) - 48) + carry;
                carry = temp / 2;
                str = temp % 2 + str;
            }
        }
        if(carry==1) str="1"+str;//最后一项加完进位的1
        return str;
    }
}
