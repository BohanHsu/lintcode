package sortList;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/24/16.
 */
public class SolutionTestSortList {

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
    public void testSortList() {
        Solution solution = new Solution();
        int[] arrayList = new int[]{2,1};
        int[] expectedResult = Arrays.copyOf(arrayList, arrayList.length);
        Arrays.sort(expectedResult);
        int[] actualResult = convertListToArray(solution.sortList(convertArrayToList(arrayList)));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        solution = new Solution();
        arrayList = new int[]{};
        expectedResult = Arrays.copyOf(arrayList, arrayList.length);
        Arrays.sort(expectedResult);
        actualResult = convertListToArray(solution.sortList(convertArrayToList(arrayList)));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        solution = new Solution();
        arrayList = new int[]{1};
        expectedResult = Arrays.copyOf(arrayList, arrayList.length);
        Arrays.sort(expectedResult);
        actualResult = convertListToArray(solution.sortList(convertArrayToList(arrayList)));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        solution = new Solution();
        arrayList = new int[]{2,3,1};
        expectedResult = Arrays.copyOf(arrayList, arrayList.length);
        Arrays.sort(expectedResult);
        actualResult = convertListToArray(solution.sortList(convertArrayToList(arrayList)));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

        solution = new Solution();
        arrayList = new int[]{2,3,1,7,6,4,8,99,4,3,5};
        expectedResult = Arrays.copyOf(arrayList, arrayList.length);
        Arrays.sort(expectedResult);
        actualResult = convertListToArray(solution.sortList(convertArrayToList(arrayList)));
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}