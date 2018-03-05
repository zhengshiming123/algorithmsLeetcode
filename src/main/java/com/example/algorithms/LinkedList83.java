package com.example.algorithms;

/**
 * Created by h on 2018/3/2.
 */
public class LinkedList83 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        listNode.next=listNode2;
        listNode2.next=listNode3;
        LinkedList83 linkedList83 = new LinkedList83();
        ListNode listNode1 = linkedList83.deleteDuplicates1(listNode);
        System.out.println(listNode1);
    }

    public ListNode deleteDuplicates1(ListNode head) {

        if ( head == null || head.next == null) {
            return null;
        }
        head.next = deleteDuplicates1(head.next);
        System.out.println(head.val);
        return head.next!= null&&head.val == head.next.val ? head.next : head;
    }
    public ListNode deleteDuplicates(ListNode head) {

        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;

        while (head != null){

            if (head.next !=null && head.val == head.next.val) {
                head = head.next;
            } else {
                sentinel.next = new ListNode(head.val);
                head = head.next;
                sentinel = sentinel.next;
            }

        }
        return d.next;
    }
}
