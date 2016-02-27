package reverseLinkedListII;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

/**
 * Created by bohan on 2/26/16.
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        if (head == null) {
            return null;
        }

        int index = 1;
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode ptr = head;
        ListNode prev = fakeHead;
        while (index < m) {
            prev = ptr;
            ptr = ptr.next;
            index++;
        }

        ListNode tail = ptr;

        while (index < n) {
            ListNode node = tail.next;
            tail.next = node.next;
            node.next = prev.next;
            prev.next = node;
            index++;
        }

        return fakeHead.next;
    }
}
