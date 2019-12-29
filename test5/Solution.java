package test5;

import org.junit.Test;

//最长回文子串
public class Solution {
    @Test
    public void test() {
        System.out.println(longestPalindrome( "babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("s"));
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String str = "";
        boolean [][]tf = new boolean[n][n];
        for (int i=n-1; i>=0; i--) {
            for (int j=i; j<n; j++) {
                tf[i][j] = (s.charAt(i)==s.charAt(j)&&(j-i<2||tf[i+1][j-1]));
                //"||"运算，当左侧为true时，右侧不再进行判断(当n=1,带入其中，不再担心tf[i+1]...越界)
                if(tf[i][j]&&(j-i+1)>str.length()) str=s.substring(i,j+1);
            }
        }
        return str;
    }
}
