package mergeTwoSortedLists;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/20/16.
 */
public class SolutionTestMergeTwoSortedLists {
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
    public void testMergeTwoLists() {
        Solution solution = new Solution();
        ListNode l1 = convertArrayToList(new int[]{1,3,8,11,15});
        ListNode l2 = convertArrayToList(new int[]{2});
        int[] expectedResult = new int[]{1,2,3,8,11,15};
        int[] actualResult = convertListToArray(solution.mergeTwoLists(l1, l2));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        l1 = convertArrayToList(new int[]{1,3,8,11,15});
        l2 = convertArrayToList(new int[]{0});
        expectedResult = new int[]{0,1,3,8,11,15};
        actualResult = convertListToArray(solution.mergeTwoLists(l1, l2));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        l1 = convertArrayToList(new int[]{1,3,8,11,15});
        l2 = convertArrayToList(new int[]{19});
        expectedResult = new int[]{1,3,8,11,15,19};
        actualResult = convertListToArray(solution.mergeTwoLists(l1, l2));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}