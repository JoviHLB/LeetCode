package test38;

import org.junit.Test;

//报数
public class Solution {
    @Test
    public void test() {
        System.out.println(countAndSay(4));
    }
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder();
        str.append(1);
        n--;
        while (n!=0) {
            //每一行的字符串(后来读题发现只要输出某一行的，而不是所有的)
            StringBuilder sbTemp = new StringBuilder();
            for (int i = 0, len = str.length(); i < len; i++) {
                int j = i;
                //计数有几个相同的字符
                int count = 0;
                //双指针的后指针往后位移并且如果与第一个指针的字符相等则继续位移且计数
                while (j < len && str.charAt(j) == str.charAt(i)) {
                    j++;
                    count++;
                }
                // 记录 计数+字符 表示 几个什么字符
                sbTemp.append(count).append(str.charAt(i));
                // 位移第一个指针，(因为表达式3有个i++,所以这里不是i = j ,而是 i = j - 1)
                i = j - 1;
            }
            n--;
            // 将该行的字符串赋值给sb,让下一次循环遍历该行
            str = sbTemp;
        }
        return str.toString();
    }
}
