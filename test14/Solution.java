package test14;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        String []strings = {"dog","racecar","car"};//output:""  is Ok
        //String []strings = {"flower","flow","flight"};//output:fl  is Ok
        System.out.println(longestCommonPrefix(strings));
    }
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int count = strs[0].length();
        //为防止超出数组长度，找到最短长度
        for (int i = 1; i < strs.length; i++) count = Math.min(strs[i].length(), count);
        for (int i = 0; i < count; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    if(i==1) return "";
                    return result;
                }
            }
            result+=strs[0].charAt(i);//前面for成立后，证实该列都相同。
        }
        return result;
        //下面是题解库方法
//        if(strs.length == 0)
//            return "";
//        String ans = strs[0];//拿第一个作为基准，截取数组得到最终结果
//        for(int i =1;i<strs.length;i++) {
//            int j=0;
//            for(;j<ans.length() && j < strs[i].length();j++) {
//                if(ans.charAt(j) != strs[i].charAt(j))
//                    break;
//            }
//            ans = ans.substring(0, j);
//            if(ans.equals(""))
//                return ans;
//        }
//        return ans;
    }
}
