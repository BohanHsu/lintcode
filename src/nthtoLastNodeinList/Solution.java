package nthtoLastNodeinList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

/**
 * Created by bohan on 2/25/16.
 */
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list.
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here

        int length = 0;
        ListNode ptr = head;
        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }

        ptr = head;
        int i = 0;
        while (i < length - n) {
            ptr = ptr.next;
            i++;
        }

        return ptr;
    }
}
