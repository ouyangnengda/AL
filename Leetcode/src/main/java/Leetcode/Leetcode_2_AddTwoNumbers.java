package Leetcode;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月06日 21:29:00
 **/
public class Leetcode_2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;

        ListNode result = new ListNode(1);
        ListNode p = result;
        //是否进位
        int before = 0;
        while (first != null || second != null) {
            int f = first != null ? f = first.val : 0;
            int s = second != null ? s = second.val : 0;
            int sum = f + s + before;
            p.next = new ListNode(sum%10);
            before = 0;
            if (sum > 9) {
                before = 1;
            }
            if (first != null) {first = first.next;}
            if (second != null) {second = second.next;}
            p = p.next;
        }
        if (before != 0) {
            p.next = new ListNode(1);
        }
        return result.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
