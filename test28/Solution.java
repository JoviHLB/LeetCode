package test28;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack,needle));
        haystack = "aaaaa";
        needle = "bba";
        System.out.println(strStr(haystack,needle));
    }
    public int strStr(String haystack,String needle) {
        if(needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;
        int start = 0,end = needle.length()-1;
        while (end < haystack.length()) {
            if(haystack.substring(start,end+1).equals(needle)) return start;
            else {
                start++;
                end++;
            }
        }
        return -1;
    }
}
