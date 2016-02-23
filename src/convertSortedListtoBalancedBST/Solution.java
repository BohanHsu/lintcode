package convertSortedListtoBalancedBST;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}


/**
 * Created by bohan on 2/21/16.
 */
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here

        if (head == null) {
            return null;
        }

        int length = 0;
        ListNode ptr = head;

        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }

        if (length == 1) {
            return new TreeNode(head.val);
        }

        ListNode prev = null;
        ptr = head;

        int i = 0;
        while (i < length / 2) {
            prev = ptr;
            ptr = ptr.next;
            i++;
        }

        prev.next = null;

        TreeNode root = new TreeNode(ptr.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(ptr.next);
        return root;
    }
}
