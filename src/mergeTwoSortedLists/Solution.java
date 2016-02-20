package mergeTwoSortedLists;

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
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode point = head;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                point.next = l2;
                l2 = l2.next;
                point = point.next;
            } else if (l2 == null) {
                point.next = l1;
                l1 = l1.next;
                point = point.next;
            } else if (l1.val < l2.val) {
                point.next = l1;
                l1 = l1.next;
                point = point.next;
            } else {
                point.next = l2;
                l2 = l2.next;
                point = point.next;
            }
        }

        return head.next;
    }
}
