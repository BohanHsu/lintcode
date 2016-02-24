package copyListwithRandomPointer;

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};

/**
 * Created by bohan on 2/23/16.
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }

        RandomListNode ptr = head;

        while (ptr != null) {
            RandomListNode newNode = new RandomListNode(ptr.label);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }

        ptr = head;

        while (ptr != null) {
            if (ptr.random == null) {
                ptr.next.random = null;
            } else {
                ptr.next.random = ptr.random.next;
            }
            ptr = ptr.next.next;
        }

        head = head.next;
        ptr = head;

        while (ptr != null) {
            if (ptr.next != null) {
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }

        return head;
    }
}
