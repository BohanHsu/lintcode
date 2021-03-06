package reverseLinkedList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/20/16.
 */
public class SolutionTestReverselinkedList {
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

    public int[] reverseArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - 1 - i];
        }
        return result;
    }

    @Test
    public void testReverse() {
        Solution solution = new Solution();
        int[] expectedResult = new int[]{1,2,3,4,5};
        ListNode head = convertArrayToList(reverseArray(expectedResult));
        int[] actualResult = convertListToArray(solution.reverse(head));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}