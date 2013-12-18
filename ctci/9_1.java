/*
 * You are given two sorted arrays, A and B, and A has a large enough buffer at 
 * the end to hold B. Write a method to merge B into A in sorted order.
 */
public class Solution {
    public int[] merge(int[] A, int[] B) {
        int i = A.length - 1, j = B.length - 1;
        while(j >= 0) {
            if(i >= 0)
                A[i + j + 1] = (A[i] > B[j]) ? A[i--] : B[j--];
            else
                A[j] = B[j--];
        }
        return A;
    }
}
