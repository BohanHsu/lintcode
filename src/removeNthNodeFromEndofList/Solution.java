package removeNthNodeFromEndofList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */

/**
 * Created by bohan on 2/19/16.
 */
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        if (n <= 0) {
            return head;
        }

        int length = 0;
        ListNode point = head;
        while (point != null) {
            length++;
            point = point.next;
        }

        ListNode prev = null;
        point = head;
        int index = length - n;

        if (index == 0) {
            point = head.next;
            head.next = null;
            return point;
        }

        int i = 0;
        while (i < index) {
            prev = point;
            point = point.next;
            i++;
        }

        prev.next = point.next;

        return head;
    }
}
