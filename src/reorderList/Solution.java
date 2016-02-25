package reorderList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


/**
 * Created by bohan on 2/23/16.
 */
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: void
     */
    public void reorderList(ListNode head) {
        // write your code here
        if (head == null) {
            return;
        }

        ListNode ptr = head;
        int length = 0;
        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }

        ListNode prev = null;
        ptr = head;
        int i = 0;
        while (i < (length + 1) / 2) {
            prev = ptr;
            ptr = ptr.next;
            i++;
        }

        prev.next = null;
        ListNode newHead = ptr;

        if (newHead != null) {
            ptr = ptr.next;
            newHead.next = null;

            while (ptr != null) {
                ListNode tmp = ptr.next;
                ptr.next = newHead;
                newHead = ptr;
                ptr = tmp;
            }
        }

        ptr = head;
        while (newHead != null) {
            ListNode tmp = newHead;
            newHead = newHead.next;
            tmp.next = ptr.next;
            ptr.next = tmp;
            ptr = tmp.next;
        }
    }
}
