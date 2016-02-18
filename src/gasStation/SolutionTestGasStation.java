package gasStation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bohan on 2/18/16.
 */
public class SolutionTestGasStation {
    @Test
    public void testCanCompleteCircuit() {
        Solution solution = new Solution();
        int[] gas = new int[]{1,1,3,1};
        int[] cost = new int[]{2,2,1,1};
        int expectedResult = 2;
        assertEquals(expectedResult, solution.canCompleteCircuit(gas, cost));

        gas = new int[]{1,2,3,4,5};
        cost = new int[]{3,4,5,1,2};
        expectedResult = 3;
        assertEquals(expectedResult, solution.canCompleteCircuit(gas, cost));
    }

}