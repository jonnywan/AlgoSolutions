/*
Implement next permutation, which rearranges numbers into the lexicographically 
next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible 
order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding 
outputs are in the right-hand column.

1,2,3 ¡ú 1,3,2
3,2,1 ¡ú 1,2,3
1,1,5 ¡ú 1,5,1
 * 
 */
public class NextPermutation {

    public void nextPermutation(int[] num) {
        int i = num.length - 2;
        for (; i >= 0; i--) {
            if (num[i] < num[i + 1]) 
                break;
        }
        if (i < 0) {
            for (i = 0; i < num.length / 2; i++) {
                int temp = num[i];
                num[i] = num[num.length - 1 - i];
                num[num.length - 1 - i] = temp;
            }
        } else {
            int j = num.length - 1;
            for (; j > i; j--) {
                if (num[j] > num[i]) 
                    break;
            }
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            for (j = i + 1; j < (i + 1 + num.length) / 2; j++) {
                temp = num[j];
                num[j] = num[num.length + i - j];
                num[num.length + i - j] = temp;
            }
        }
    }
}
