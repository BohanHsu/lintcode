package copyListwithRandomPointer;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/23/16.
 */
public class SolutionTestCopyListwithRandomPointer {

    public boolean checkRandomList(RandomListNode head1, RandomListNode head2) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode ptr1 = head1;
        RandomListNode ptr2 = head2;
        while (ptr1 != null && ptr2 != null) {
            map.put(ptr1, ptr2);
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 != null || ptr2 != null) {
            return false;
        }

        ptr1 = head1;
        ptr2 = head2;

        while (ptr1 != null && ptr2 != null) {
            if (map.get(ptr1.random) != ptr2.random) {
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;
    }

    public RandomListNode arraysToRandomList(int[] labels, int[] randomPointer) {
        RandomListNode[] nodeArr = new RandomListNode[labels.length];
        nodeArr[0] = new RandomListNode(labels[0]);
        for (int i = 1; i < labels.length; i++) {
            nodeArr[i] = new RandomListNode(labels[i]);
            nodeArr[i-1].next = nodeArr[i];
        }

        for (int i = 0; i < randomPointer.length; i++) {
            if (randomPointer[i] >= 0) {
                nodeArr[i].random = nodeArr[randomPointer[i]];
            }
        }

        return nodeArr[0];
    }

    @Test
    public void testCopyRandomList() {
        Solution solution = new Solution();

        RandomListNode rln1 = arraysToRandomList(new int[]{1,2,3}, new int[]{2,-1,0});
        RandomListNode rln2 = arraysToRandomList(new int[]{1,2,3}, new int[]{2,-1,0});

        RandomListNode newHead = solution.copyRandomList(rln2);

        assertTrue(checkRandomList(rln1, newHead));
    }
}