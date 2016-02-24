package linkedListCycle;

/**
 * Created by bohan on 2/23/16.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null) {
            if (fastPtr.next == null) {
                return false;
            }
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }
}
