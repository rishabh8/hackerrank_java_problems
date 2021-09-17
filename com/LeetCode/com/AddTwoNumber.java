package com.LeetCode.com;

public class AddTwoNumber {
    public static void main(String[] args) {

        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode previous = null;
        ListNode temp = null;

        int carry = 0, sum = 0;

        while(l1 != null || l2 != null ) {
            sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum %= 10;
            temp = new ListNode(sum);
            if(res == null) {
                res = temp;
            } else {
                previous.next = temp;
            }

            previous = temp;
            if(l1!=null) {
                l1 = l1.next;
            }
            if(l2!= null) {
                l2 = l2.next;
            }
        }

        if(carry > 0) {
            temp.next = new ListNode(carry);
        }
        return res;
    }

    void printList(ListNode head)
    {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("");
    }

}
