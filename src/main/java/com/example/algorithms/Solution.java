package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        //listNode.val=1;
        listNode.next=listNode2;
        listNode2.next=listNode3;
        /*ListNode listNodeT = new ListNode(3);
        listNodeT.val=1;
        listNodeT.next.val=2;
        listNodeT.next.next.val=3;*/
        //ListNode listNode1 = solution.addTwoNumbers(listNode, listNodeT);
        //System.out.println(listNode1);
        List rel = new ArrayList();
        //List val = solution.getVal(listNode,rel);
        ListNode listNode1 = solution.addTwoNumbers1(listNode, listNode);
        System.out.println(listNode1);
        //System.out.println(Integer.parseInt(null));
    }

    public List getVal(ListNode l1,List l) {
        List li = new ArrayList();
        if (null != l1) {
            int val = l1.val;
            l.add(val);
            if (l1.next != null) {
                getVal(l1.next,l);
                System.out.println(111);
                //return l;
            }
        }
        li = l;
        return li;

    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            //prev = cur;
            prev = prev.next;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = l1.val + l2.val;
        int i1 = l1.next.val + l2.next.val;
        int i2 = l1.next.next.val + l2.next.next.val;

        int i3=0;
        if (i >= 10) {
            i = i - 10;
            i1=i1+1;
        }
        if (i1 >= 10) {
            i1 = i1 - 10;
            i2=i2+1;
        }
        if (i2 >= 10) {
            i2 = i2 - 10;
            i3=i3+1;
        }


        ListNode listNode = new ListNode(2);
        return listNode;

    }
}
