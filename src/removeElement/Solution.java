package removeElement;

public class Solution {
    /**
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int[] arr = A;
        int i = 0;
        int j = arr.length - 1;
        //int count = 0;

        while (i <= j) {
            if (arr[i] == elem) {
                while (arr[j] == elem && j > i) {
                    j--;
                }
                if (arr[j] != elem) {
                    swap(arr, i, j);
                } else {
                    return i;
                }
            }
            i++;
        }
        return i;
    }

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
