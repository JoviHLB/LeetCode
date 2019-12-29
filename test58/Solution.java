package test58;

import org.junit.Test;


//最后一个单词的长度
public class Solution {
    @Test
    public void test() {
        System.out.println(lengthOfLastWord("Hello world  "));
    }
    public int lengthOfLastWord(String s) {
        int i = 0;
        for (int j=s.length()-1; j>=0; j--) {
            if(s.charAt(j)!=' ') {
                i++;
                continue;
            }
            if(i>0) return i;
        }
        return i;
    }
}
