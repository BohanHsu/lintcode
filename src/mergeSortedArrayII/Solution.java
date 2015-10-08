package mergeSortedArrayII;

import java.util.ArrayList;

class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> a = A;
        ArrayList<Integer> b = B;
        ArrayList<Integer> result = new ArrayList<Integer>(a.size() + b.size() - 1);

        int i = 0, j = 0;
        while (i < a.size() || j < b.size()) {
            if (i >= a.size() && j < b.size()) {
                result.add(b.get(j));
                j++;
            } else if (i < a.size() && j >= b.size()) {
                result.add(a.get(i));
                i++;
            } else {
                if (a.get(i).intValue() < b.get(j).intValue()) {
                    result.add(a.get(i));
                    i++;
                } else {
                    result.add(b.get(j));
                    j++;
                }
            }
        }
        return result;
    }
}
