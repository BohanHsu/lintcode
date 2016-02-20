package removeDepulicatesFromSortedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

/**
 * Definition for ListNode
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
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode point = head;
        while (point != null) {
            while (point.next != null && point.next.val == point.val) {
                point.next = point.next.next;
            }
            point = point.next;
        }
        return head;
    }
}
