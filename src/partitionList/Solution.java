package partitionList;

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
 * Created by bohan on 2/20/16.
 */
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        ListNode lt = new ListNode(0);
        ListNode goet = new ListNode(0);
        ListNode headLt = lt;
        ListNode headGoet = goet;

        ListNode point = head;
        while (point != null) {
            if (point.val < x) {
                lt.next = point;
                lt = lt.next;
            } else {
                goet.next = point;
                goet = goet.next;
            }
            point = point.next;
        }
        goet.next = null;
        lt.next = headGoet.next;
        return headLt.next;
    }
}

