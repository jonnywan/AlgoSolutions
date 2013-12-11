/*
 * Given an array with n objects colored red, white or blue, sort them so that 
 * objects of the same color are adjacent, with the colors in the order red, 
 * white and blue.

 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, 
 * and blue respectively.

 * Note:
 * You are not suppose to use the library's sort function for this problem.

 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite 
 * array with total number of 0's, then 1's and followed by 2's.

 * Could you come up with an one-pass algorithm using only constant space? 
 */
public class SortColors {
/**************************** updated 2013/12/11 *****************************/

    public void sortColors(int[] A) {
        int[] cnt = new int[3];
        for(int i = 0; i < A.length; i++) 
            cnt[A[i]]++;
        for(int i = 0, index = 0; i < 3; i++)
            for(int j = 0; j < cnt[i]; j++) 
                A[index++] = i;
    }

/*****************************************************************************/

    public void sortColors(int[] A) {
        int redCount = 0, whiteCount = 0, blueCount = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0)
                redCount++;
            else if(A[i] == 1)
                whiteCount++;
            else
                blueCount++;
        }
        for(int i = 0; i < A.length; i++) {
            if(i < redCount)
                A[i] = 0;
            else
                A[i] = i < redCount + whiteCount ? 1 : 2;
        }
    }

/*****************************************************************************/

    public void sortColors(int[] A) {
        int left = 0, right = A.length - 1;
        for(int i = 0; i <= right; i++) {
            if(A[i] == 0)
                swap(A, i, left++);
            else if(A[i] == 2) 
                swap(A, i--, right--);
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
