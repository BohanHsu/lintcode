package removeDuplicatesfromSortedListII;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


/**
 * Created by bohan on 2/25/16.
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        ListNode fakeHead = new ListNode(head.val - 1);
        fakeHead.next = head;
        ListNode ptr = head;
        ListNode prev = fakeHead;

        while (ptr != null) {
            if (ptr.next == null) {
                if (prev.next == ptr) {
                    ptr = ptr.next;
                } else {
                    prev.next = null;
                    ptr = ptr.next;
                }
            } else {
                if (ptr.next.val == ptr.val) {
                    ptr = ptr.next;
                } else {
                    if (prev.next == ptr) {
                        prev = ptr;
                        ptr = ptr.next;
                    } else {
                        prev.next = ptr.next;
                        ptr = prev.next;
                    }
                }
            }
        }
        return fakeHead.next;
    }
}

