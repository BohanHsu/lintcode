package sortList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

/**
 * Created by bohan on 2/24/16.
 */
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        int length = 0;
        ListNode ptr = head;

        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }

        int i = 0;
        ListNode prev = null;
        ptr = head;
        while (i < length / 2) {
            prev = ptr;
            ptr = ptr.next;
            i++;
        }

        ListNode head1 = head;
        prev.next = null;
        ListNode head2 = ptr;

        return mergeList(head1, head2);
    }

    public ListNode mergeList(ListNode head1, ListNode head2) {
        head1 = sortList(head1);
        head2 = sortList(head2);
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (head1 != null || head2 != null) {
            if (head1 == null) {
                tail.next = head2;
                head2 = head2.next;
                tail = tail.next;
                tail.next = null;
            } else if (head2 == null) {
                tail.next = head1;
                head1 = head1.next;
                tail = tail.next;
                tail.next = null;
            } else {
                if (head1.val < head2.val) {
                    tail.next = head1;
                    head1 = head1.next;
                    tail = tail.next;
                    tail.next = null;
                } else {
                    tail.next = head2;
                    head2 = head2.next;
                    tail = tail.next;
                    tail.next = null;
                }
            }
        }

        return head.next;
    }
}

