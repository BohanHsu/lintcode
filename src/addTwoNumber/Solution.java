package addTwoNumber;

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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        int carrier = 0;

        ListNode head = new ListNode(0);
        ListNode tail = head;

        while (l1 != null || l2 != null) {
            int digit = -1;

            if (l1 == null) {
                int num = l2.val + carrier;
                digit = num % 10;
                carrier = num / 10;
                //sum += (base * digit);

                l2 = l2.next;
            } else if (l2 == null) {
                int num = l1.val + carrier;
                digit = num % 10;
                carrier = num / 10;

                l1 = l1.next;
            } else {
                int num = l1.val + l2.val + carrier;
                digit = num % 10;
                carrier = num / 10;

                l1 = l1.next;
                l2 = l2.next;
            }
            tail.next = new ListNode(digit);
            tail = tail.next;
        }

        if (carrier != 0) {
            tail.next = new ListNode(carrier);
        }

        return head.next;
    }
}
