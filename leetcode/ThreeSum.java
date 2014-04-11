/*
 * Given an array S of n integers, are there elements a, b, c in S such that 
 * a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.

 * Note:

 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <= b 
 * <= c)
 * The solution set must not contain duplicate triplets.
 *   For example, given array S = {-1 0 1 2 -1 -4},

 *   A solution set is:
 *   (-1, 0, 1)
 *   (-1, -1, 2)
 */
import java.util.*;

public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        HashSet<ArrayList<Integer>> res = new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            ArrayList<ArrayList<Integer>> subList = twoSum(num, -num[i]);
            for (ArrayList<Integer> list : subList) {
                if (list.get(0) != i && list.get(1) != i) {
                    int[] temp = new int[3];
                    temp[0] = i;
                    temp[1] = list.get(0);
                    temp[2] = list.get(1);
                    Arrays.sort(temp);
                    ArrayList<Integer> triple = new ArrayList<Integer>();
                    for (int j = 0; j < 3; j ++) 
                        triple.add(num[temp[j]]);
                    if (!res.contains(triple))
                        res.add(triple);
                }
            }
        }
        return new ArrayList<ArrayList<Integer>>(res);
    }

    public ArrayList<ArrayList<Integer>> twoSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int i = 0; 
        int j = num.length - 1;
        while (i < j) {
            if (num[i] + num[j] == target) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                list.add(j);
                res.add(list);
                i++;
                j--;
            } else if (num[i] + num[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
	
}
