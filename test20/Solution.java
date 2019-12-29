package test20;

import org.junit.Test;

import java.util.Stack;

//有效的括号
public class Solution {
    @Test
    public void test() {
        System.out.println(isValid(""));
    }
    public boolean isValid(String s) {
        Stack stack = new Stack();
        boolean b = true;
        if(s.length()!=0) if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') return false;
        if(s.length()%2==1) b=false;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            switch(ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                case ')':
                case ']':
                    if(!stack.isEmpty()) {
                        char tmp = (char)stack.pop();
                        if(ch=='}'&&tmp!='{'||ch==']'&&tmp!='['||ch==')'&&tmp!='(')
                            b=false;
                    }
                    break;
                default :
                    break;
            }
        }
        if(!stack.isEmpty()) b=false;
        return b;
    }
}
