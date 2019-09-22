package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 判断该链表是否为环形链表
 * @Author: 欧阳能达
 * @Created: 2019年09月21日 21:43:00
 **/
public class Leetcode_141_HasCycle {
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode1;
        System.out.println("1 : " + hasCycle(new ListNode(1)));
        System.out.println("1->2 : " + hasCycle(new ListNode(1).next = new ListNode(2)));
        System.out.println("1->2->1 : " + hasCycle(listNode1));
    }

    public static boolean hasCycle(ListNode listNode) {
        if (listNode == null) {
            return false;
        }
        if (listNode.next == null) {
            return true;
        }

        //hashcode——无用
        Map<Integer, Integer> map = new HashMap<>();

        while (listNode != null) {
            if (map.containsKey(listNode.hashCode())) {
                return true;
            }
            map.put(listNode.hashCode(), 1);
            listNode = listNode.next;
        }
        return false;
    }
}
