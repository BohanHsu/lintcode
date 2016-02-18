package binaryRepresentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by bohan on 2/13/16.
 */
public class Solution {
    /**
     *@param n: Given a decimal number that is passed in as a string
     *@return: A string
     */
    public String binaryRepresentation(String n) {
        // write your code here

        final String Err = "ERROR";

        boolean positive = true;
        if (n.charAt(0) == '-') {
            positive = false;
            n = n.substring(1, n.length());
        }

        String numericResult = binaryRepresentationNumeric(n, (positive ? 32 : 31));

        if (numericResult == null) {
            return Err;
        }
        return (positive ? "" : "-") + numericResult;
    }

    String binaryRepresentationNumeric(String n, int limit) {
        int indexOfPoint = n.indexOf('.');
        String integralDecimal = null;
        String fractionDecimal = null;

        if (indexOfPoint == -1) {
            integralDecimal = n.substring(0, n.length());
        } else {
            integralDecimal = n.substring(0, indexOfPoint);
            fractionDecimal = n.substring(indexOfPoint + 1);
        }

        String integralBinary = integralDecimalToBinary(Long.parseLong(integralDecimal));
        if (integralBinary == null) {
            return null;
        }

        if (indexOfPoint != -1) {
            String fractionBinary = fractionDecimalToBinary(fractionDecimal, 32);
            if (fractionBinary == null) {
                return null;
            } else {
                if (fractionBinary.equals("")) {
                    return integralBinary;
                } else {
                    return integralBinary + "." + fractionBinary;
                }
            }
        } else {
            return integralBinary;
        }
    }

    String fractionDecimalToBinary(String fractionDecimal, int fractionLimt) {
        char[] charArray = fractionDecimal.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i] -  48;
        }

        int[] result = new int[fractionLimt];

        int j = 0;
        boolean allZero = true;
        while (j < fractionLimt) {
            allZero = true;
            int carrier = 0;
            for (int k = intArray.length - 1; k >= 0; k--) {

                allZero = allZero && (intArray[k] == 0);
                int stepResult = intArray[k] * 2 + carrier;
                intArray[k] = stepResult % 10;
                carrier = stepResult / 10;

            }

            result[j] = carrier;
            if (allZero) {
                break;
            }
            j++;
        }

        allZero = true;
        for (int k = intArray.length - 1; k >= 0; k--) {
            allZero  = allZero && (intArray[k] == 0);
        }

        if (!allZero) {
            return null;
        }
        char[] resultChars = new char[j];
        for (int k = 0; k < j; k++) {
            resultChars[k] = (char)(result[k] + 48);
        }
        return new String(resultChars);
    }

    String integralDecimalToBinary(long integral) {
        LinkedList<Character> stack = new LinkedList<Character>();
        int count = 0;
        while (integral > 0) {
            if (count == 32) {
                return null;
            }
            stack.add((char)(integral % 2 + 48));
            integral /= 2;
            count++;
        }

        Collections.reverse(stack);
        char[] array = new char[stack.size()];
        int i = 0;

        for (Character num : stack) {
            array[i] = num;
            i++;
        }

        if (array.length == 0) {
            return "0";
        }

        return new String(array);
    }
}
