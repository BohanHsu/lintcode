package nthtoLastNodeinList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/25/16.
 */
public class SolutionTestNthtoLastNodeinList {

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
    public void testNthToLast() {
        Solution solution = new Solution();
        int[] array = new int[]{3,2,1,5};
        int n = 1;
        int[] expectedResult = new int[]{5};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(convertListToArray(solution.nthToLast(convertArrayToList(array) ,n))));

        array = new int[]{3,2,1,5};
        n = 2;
        expectedResult = new int[]{1,5};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(convertListToArray(solution.nthToLast(convertArrayToList(array) ,n))));

        array = new int[]{3,2,1,5};
        n = 4;
        expectedResult = new int[]{3,2,1,5};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(convertListToArray(solution.nthToLast(convertArrayToList(array) ,n))));
    }

}