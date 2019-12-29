package test61;

import org.junit.Test;

public class Solution {
    //1->2->3->4->5->null k=2
    //4->5->1->2->3
    public ListNode rotateRight(ListNode head, int k) {
        ListNode last = head;
        ListNode previous = null;
        ListNode position = head;
        ListNode temp = head;
        int size = 0;
        int key=0;
        if(head==null) return head;
        while(last!=null) {
            size++;
            previous=last;
            last=last.next;
        }
        if(size!=0) {
            key=size-(k%size);
        }
        while(position!=null&&key>1) {
            position=position.next;
            key--;
        }
        previous.next=head;
        temp=position.next;
        position.next=null;
        return temp;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
