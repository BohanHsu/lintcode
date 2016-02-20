package reverseLinkedList;

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

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

/**
 * Created by bohan on 2/20/16.
 */
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode newHead = head;
        ListNode point = head.next;
        while (point != null) {
            ListNode nextPoint = point.next;
            point.next = newHead;
            newHead = point;
            point = nextPoint;
        }
        head.next = null;
        return newHead;
    }
}