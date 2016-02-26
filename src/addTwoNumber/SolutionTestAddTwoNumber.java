package addTwoNumber;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/25/16.
 */
public class SolutionTestAddTwoNumber {

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
    public void testAddLists() {
        Solution solution = new Solution();
        ListNode l1 = convertArrayToList(new int[]{7,1,6});
        ListNode l2 = convertArrayToList(new int[]{5,9,2});
        int[] expectedResult = new int[]{2,1,9};
        int[] actualResult = convertListToArray(solution.addLists(l1, l2));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        l1 = convertArrayToList(new int[]{3,1,5});
        l2 = convertArrayToList(new int[]{5,9,2});
        expectedResult = new int[]{8,0,8};
        actualResult = convertListToArray(solution.addLists(l1, l2));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        l1 = convertArrayToList(new int[]{3,1,5});
        l2 = convertArrayToList(new int[]{5});
        expectedResult = new int[]{8,1,5};
        actualResult = convertListToArray(solution.addLists(l1, l2));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}
