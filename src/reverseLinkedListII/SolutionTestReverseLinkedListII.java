package reverseLinkedListII;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/26/16.
 */
public class SolutionTestReverseLinkedListII {

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
    public void testReverseBetween() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4,5};
        int m = 2;
        int n = 4;
        int[] expectedResult = new int[]{1,4,3,2,5};
        int[] actualResult = convertListToArray(solution.reverseBetween(convertArrayToList(nums), m, n));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        nums = new int[]{1,2,3,4,5};
        m = 2;
        n = 2;
        expectedResult = new int[]{1,2,3,4,5};
        actualResult = convertListToArray(solution.reverseBetween(convertArrayToList(nums), m, n));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

}