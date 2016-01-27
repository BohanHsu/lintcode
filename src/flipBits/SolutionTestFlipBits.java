package flipBits;

import compareStrings.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTestFlipBits {
    @Test
    public void testBitSwapRequired() {
        int a = 31, b = 14;
        Solution solution = new Solution();
        assertEquals(2, solution.bitSwapRequired(a, b));
    }

}