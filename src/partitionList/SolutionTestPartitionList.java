package partitionList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/20/16.
 */
public class SolutionTestPartitionList {
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

    @Test
    public void testPartition() {
        Solution solution = new Solution();
        ListNode head = convertArrayToList(new int[]{1,4,3,2,5,2});
        int x = 3;
        int[] expectedResult = new int[]{1,2,2,4,3,5};
        int[] actualResult = convertListToArray(solution.partition(head, x));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}