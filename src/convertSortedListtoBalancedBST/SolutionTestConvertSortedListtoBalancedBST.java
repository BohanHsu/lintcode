package convertSortedListtoBalancedBST;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/22/16.
 */
public class SolutionTestConvertSortedListtoBalancedBST {

    public int[] convertListToArray(ListNode head) {
        LinkedList<ListNode> linkedList = new LinkedList<ListNode>();
        ListNode point = head;
        while (point != null) {
            linkedList.add(point);
            point = point.next;
        }

        int[] nums = new int[linkedList.size()];
        int i = 0;
        for (ListNode ln : linkedList) {
            nums[i] = ln.val;
            i++;
        }
        return nums;
    }

    public ListNode convertArrayToList(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode point = head;

        for (int i = 1; i < nums.length; i++) {
            point.next = new ListNode(nums[i]);
            point = point.next;
        }
        return head;
    }

    public boolean checkSearchTree(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        checkSearchTreeHelper(list, root);

        int[] nums = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            nums[i] = integer;
            i++;
        }

        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] > nums[j+1]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkBalancedTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        int depthLeft = depthOfTree(root.left);
        int depthRight = depthOfTree(root.right);
        if (depthLeft - depthRight > 1 || depthLeft - depthRight < -1) {
            return false;
        } else {
            boolean leftBalance = checkBalancedTree(root.left);
            boolean rightBalance = checkBalancedTree(root.right);
            return leftBalance && rightBalance;
        }
    }

    public int depthOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        HashMap<TreeNode, Integer> depth = new HashMap<TreeNode, Integer>();
        depth.put(root, 1);

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        int max = 1;
        while (!queue.isEmpty()) {
            TreeNode tn = queue.poll();
            int tnDepth = depth.get(tn);
            if (tn.left != null) {
                queue.add(tn.left);
                depth.put(tn.left, tnDepth + 1);
            }
            if (tn.right != null) {
                queue.add(tn.right);
                depth.put(tn.right, tnDepth + 1);
            }
            if (tnDepth > max) {
                max = tnDepth;
            }
        }
        return max;
    }

    public void checkSearchTreeHelper(LinkedList<Integer> list, TreeNode root) {
        if (root.left != null) {
            checkSearchTreeHelper(list, root.left);
        }

        list.add(root.val);

        if (root.right != null) {
            checkSearchTreeHelper(list, root.right);
        }
    }

    @Test
    public void testSortedListToBST() {
        Solution solution = new Solution();
        int[] array = new int[]{1,2};
        ListNode head = convertArrayToList(array);
        TreeNode root = solution.sortedListToBST(head);
        assertEquals(true, checkSearchTree(root));
        assertEquals(true, checkBalancedTree(root));

        array = new int[]{1,2,3,4,5,6,7,8,9};
        head = convertArrayToList(array);
        root = solution.sortedListToBST(head);
        assertEquals(true, checkSearchTree(root));
        assertEquals(true, checkBalancedTree(root));
    }

}