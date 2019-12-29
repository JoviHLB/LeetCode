package test3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    @Test
    public void test() {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        int start=0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
                start=Math.max(map.get(ch),start);//更新start值，最近一次出现该值的位置
            result=Math.max(result,i-start+1);
            map.put(ch,i+1);//哈希表健值从1开始，且哈希表同key的value取最近存放的value，令key只有一个
        }
        return result;
    }
}
