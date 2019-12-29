package test6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
//Z字形变换
public class Solution {
    @Test
    public void test() {
        System.out.println(convert("LEETCODEISHIRING",4));
    }
    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        for (int i=0; i<numRows; i++)  list.add(new StringBuilder());
        int current =0 ;
        boolean goingDown = false;
        for (char ch:s.toCharArray()) {
            list.get(current).append(ch);
            if(current==0||current==numRows-1) goingDown=!goingDown;
            current+=goingDown?1:-1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder str:list) stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
