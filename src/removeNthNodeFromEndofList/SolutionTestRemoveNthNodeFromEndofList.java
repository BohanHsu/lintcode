package removeNthNodeFromEndofList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/19/16.
 */
public class SolutionTestRemoveNthNodeFromEndofList {

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
    public void testRemoveNthFromEnd() {
        Solution solution = new Solution();
        ListNode head = convertArrayToList(new int[]{1,2,3,4,5});
        int[] expectedResult = new int[]{1,2,3,5};
        int[] actualResult = convertListToArray(solution.removeNthFromEnd(head, 2));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        head = convertArrayToList(new int[]{1,2,3,4,5});
        expectedResult = new int[]{2,3,4,5};
        actualResult = convertListToArray(solution.removeNthFromEnd(head, 5));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        head = convertArrayToList(new int[]{1,2,3,4,5});
        expectedResult = new int[]{1,2,3,4};
        actualResult = convertListToArray(solution.removeNthFromEnd(head, 1));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}