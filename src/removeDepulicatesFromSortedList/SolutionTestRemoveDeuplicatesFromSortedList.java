package removeDepulicatesFromSortedList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/20/16.
 */
public class SolutionTestRemoveDeuplicatesFromSortedList {
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
    public void testDeleteDuplicates() {
        ListNode head = convertArrayToList(new int[] {1,1,2,3,3});
        int[] expectedResult = new int[]{1,2,3};
        int[] actualResult = convertListToArray(Solution.deleteDuplicates(head));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        head = convertArrayToList(new int[] {1,1,1,1,1});
        expectedResult = new int[]{1};
        actualResult = convertListToArray(Solution.deleteDuplicates(head));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}