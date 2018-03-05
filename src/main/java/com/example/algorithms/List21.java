package com.example.algorithms;

/**
 * Created by h on 2018/3/2.
 * 输入：1->2->4, 1->3->4
    输出：1->1->2->3->4->4
 */
public class List21 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode.next=listNode2;
        listNode2.next=listNode3;

        ListNode listNodeT = new ListNode(2);
        ListNode listNodeT2 = new ListNode(3);
        ListNode listNodeT3 = new ListNode(4);
        listNodeT.next=listNodeT2;
        listNodeT2.next=listNodeT3;
        List21 list21 = new List21();
        ListNode listNode1 = list21.mergeTwoLists(listNode, listNodeT);
        System.out.println(listNode1);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;

        while (c1 != null || c2 != null ) {

            if (c2 == null) {
                sentinel.next = new ListNode(c1.val);
                c1 = c1.next;
            } else if (c1 == null){
                sentinel.next = new ListNode(c2.val);
                c2 = c2.next;
            }else  if (c1.val > c2.val) {
                sentinel.next = new ListNode(c2.val);
                c2 = c2.next;
            } else if (c1.val <= c2.val) {
                sentinel.next =  new ListNode(c1.val);
                c1 = c1.next;
            } else {

            }
            //sentinel = sentinel.next;
            sentinel = sentinel.next;
        }

        return d.next;
    }
}
