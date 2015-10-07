package subarraySumClosest;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySumClosest(int[] nums) {
        class Node implements Comparable {
            int sum, index;

            public Node(int sum, int index) {
                this.sum = sum;
                this.index = index;
            }

            @Override
            public int compareTo(Object o) {
                return this.sum - ((Node) o).sum;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "sum=" + sum +
                        ", index=" + index +
                        '}';
            }
        }

        Node[] nodes = new Node[nums.length];
        int max = Integer.MAX_VALUE;
        int from = 0, to = 0;
        ArrayList<Integer> result = new ArrayList<Integer>(2);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nodes[i] = new Node(nums[i], i);
            } else {
                nodes[i] = new Node(nums[i] + nodes[i-1].sum, i);
            }
        }

        Arrays.sort(nodes);
        for (int i = 0; i< nums.length - 1; i++) {
            int localSum = Math.abs(nodes[i].sum - nodes[i + 1].sum);
            if (localSum < max) {
                if (nodes[i].index > nodes[i + 1].index) {
                    from = nodes[i+1].index + 1;
                    to = nodes[i].index;
                    max = localSum;
                } else {
                    from = nodes[i].index + 1;
                    to = nodes[i + 1].index;
                    max = localSum;
                }
            }

            localSum = Math.abs(nodes[i].sum);
            if (localSum < max) {
                from = 0;
                to = nodes[i].index;
                max = localSum;
            }
        }

        int i = nums.length - 1;
        int localSum = Math.abs(nodes[i].sum);
        if (localSum < max) {
            from = 0;
            to = nodes[i].index;
            max = localSum;
        }

        result.add(from);
        result.add(to);
        return result;
    }
}
