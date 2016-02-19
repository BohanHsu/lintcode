package deleteDigits;

import java.util.Arrays;

/**
 * Created by bohan on 2/18/16.
 */
public class Solution {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here

        if (k == A.length()) {
            return "";
        }

        Node head = null;
        Node tail = null;
        char[] chars = A.toCharArray();

        int min = 10;

        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - 48;
            min = (num < min ? num : min);
            if (i == 0) {
                head = new Node(chars[i] - 48);
                tail = head;
            } else {
                tail.next = new Node(chars[i] - 48);
                tail = tail.next;
            }
        }

        if (k == A.length() - 1) {
            return min + "";
        }

        for (int i = 0; i < k; i++) {
            Node point = head;
            Node prev = null;
            while (point.next != null && point.val <= point.next.val) {
                prev = point;
                point = point.next;
            }

            if (point.next == null) {
                prev.next = null;
            } else if (prev == null) {
                head = head.next;
            } else {
                prev.next = point.next;
            }
        }

        while (head != null) {
            if (head.val > 0) {
                break;
            } else {
                head = head.next;
            }
        }


        StringBuilder sb = new StringBuilder();
        Node point = head;
        while (point != null) {
            sb.append((char)(point.val + 48));
            point = point.next;
        }

        return sb.toString();
    }

    class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
