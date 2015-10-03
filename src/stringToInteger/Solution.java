package stringToInteger;

public class Solution {
    /**
     * @param str: A string
     * @return An integer
     */
    public int atoi(String str) {
        // write your code here
        str = str.trim();

        int dotIndex = str.indexOf('.');
        if (dotIndex != -1) {
            str = str.substring(0, dotIndex);
        }

        //int plusSingIndex = str.indexOf('+');
        //if (plusSingIndex != -1) {
        //    str = str.substring(0, plusSingIndex);
        //}

        StringBuilder sb = new StringBuilder();
        boolean plusSign = false;
        boolean contentBeforePlus = false;
        boolean minusSign = false;
        boolean wiredDigit = false;
        boolean contentBeforeWiredSign = false;
        for (char c : str.toCharArray()) {
            if (c == 45 || c >= 48 && c <= 57) {
                if ((!plusSign || !contentBeforePlus) && (!wiredDigit || !contentBeforeWiredSign)) {
                    sb.append(c);
                }
                if (c == 45) {
                    minusSign = true;
                }
            } else {
                if(c == 43) {
                    plusSign = true;
                    if (sb.length() > 0) {
                        contentBeforePlus = true;
                    }
                } else {
                    wiredDigit = true;
                    if (sb.length() > 0) {
                        contentBeforeWiredSign = true;
                    }
                }
            }
        }

        if (plusSign && minusSign) {
            return 0;
        }

        str = sb.toString();

        final int maxInteger = Integer.MAX_VALUE;
        final int minInteger = Integer.MIN_VALUE;

        int base = 0;
        int sum = 0;

        if (str.length() == 0) {
            return 0;
        }

        if (str.charAt(0) == '-') {
            if (str.length() > 11 || str.length() == 11 && str.charAt(1) > 2) {
                return minInteger;
            }

            for (int i = str.length() - 1; i >= 1; i--) {
                if (48 > str.charAt(i) || 57 < str.charAt(i)) {
                    return 0;
                }

                int digit = str.charAt(i) - 48;
                int digitVal = (int) Math.pow(10, base) * digit;
                base++;
                if ((minInteger + digitVal) > sum) {
                    return minInteger;
                }
                sum -= digitVal;
            }

        } else {
            if (str.length() > 10 || str.length() == 10 && str.charAt(0) > 2) {
                return maxInteger;
            }

            for (int i = str.length() - 1; i >= 0; i--) {
                if (48 > str.charAt(i) || 57 < str.charAt(i)) {
                    return 0;
                }

                int digit = str.charAt(i) - 48;
                int digitVal = (int) Math.pow(10, base) * digit;
                base++;
                if ((maxInteger - digitVal) < sum) {
                    return maxInteger;
                }
                sum += digitVal;
            }
        }

        return sum;
    }
}
