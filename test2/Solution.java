package test2;

import org.junit.Test;

//两数相加
public class Solution {
    @Test
    public void test() {
        //[2,4,3]
        //[5,6,4]
        //->708
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        int carry = 0;
        while(l1!=null||l2!=null||carry!=0) {
            int tmp = (l1!=null?l1.val:0)+(l2!=null?l2.val:0)+carry;
            carry = tmp/10;
            temp.next = new ListNode(tmp%10);
            temp=temp.next;
            l1=l1!=null?l1.next:l1;
            l2=l2!=null?l2.next:l2;
        }
        return listNode.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
 }
