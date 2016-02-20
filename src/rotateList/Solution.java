package rotateList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/**
 * Created by bohan on 2/20/16.
 */
public class Solution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (k == 0) {
            return head;
        }

        if (head == null) {
            return null;
        }

        int length = 0;
        ListNode ptr = head;

        ListNode tail = null;
        while (ptr != null) {
            length++;
            tail = ptr;
            ptr = ptr.next;
        }

        int index = length - (k % length);

        if (index == length) {
            return head;
        }

        ptr = head;
        ListNode prev = null;
        int i = 0;
        while (i < index) {
            prev = ptr;
            ptr = ptr.next;
            i++;
        }

        prev.next = null;
        tail.next = head;

        return ptr;
    }
}
