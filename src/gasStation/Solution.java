package gasStation;

/**
 * Created by bohan on 2/18/16.
 */
public class Solution {
    /**
     * @param gas: an array of integers
     * @param cost: an array of integers
     * @return: an integer
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // write your code here
        int sum = 0;
        int index = -1;

        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            gas[i] = gas[i] - cost[i];
            total += gas[i];
        }
        if (total < 0) {
            return index;
        }

        for (int i = 0; i < gas.length; i++) {
            sum += gas[i];
            if (sum < 0) {
                sum = 0;
                index = i;
            }
        }

        return (index + 1) % gas.length;
    }
}
