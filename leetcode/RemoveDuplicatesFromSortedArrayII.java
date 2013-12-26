/*
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?

 * For example,
 * Given sorted array A = [1,1,1,2,2,3],

 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */
public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] A) {
        if(A.length == 0)
            return 0;
        int index = 1, cnt = 1;
        for(int i = 1; i < A.length; i++) {
            cnt = (A[i] == A[i - 1]) ? cnt + 1 : 1;
            if(cnt <= 2)
                A[index++] = A[i];
        }
        return index;
    }

/**************************** updated 2013/12/26 *****************************/

    public int removeDuplicates(int[] A) {
        if(A.length == 0 || A.length == 1)
            return A.length;
        int cnt = 2, temp = A[0], prev;
        for(int i = 2; i < A.length; i++) {
            prev = A[i - 1];
            if(A[i] != A[i - 1] || A[i - 1] != temp)
                A[cnt++] = A[i];
            temp = prev;
        }
        return cnt;
    }
}
