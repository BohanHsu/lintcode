package reorderList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/24/16.
 */
public class SolutionTestReorderList {

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
    public void testReorderList() {
        Solution solution = new Solution();

        int[] originalArray = new int[]{1,2,3,4,5};
        int[] expectedResult = new int[]{1,5,2,4,3};

        ListNode head = convertArrayToList(originalArray);
        solution.reorderList(head);
        int[] actualResult = convertListToArray(head);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        originalArray = new int[]{1,2,3,4,5,6};
        expectedResult = new int[]{1,6,2,5,3,4};

        head = convertArrayToList(originalArray);
        solution.reorderList(head);
        actualResult = convertListToArray(head);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testReorderList1() {
        Solution solution = new Solution();
        solution.reorderList(null);
    }
}