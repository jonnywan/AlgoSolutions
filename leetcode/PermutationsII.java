/*
 * Given a collection of numbers, return all possible permutations.

 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
import java.util.*;

public class PermutationsII {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<Integer>());
		for(int i = 0; i < num.length; i++) {
			HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
			for(int j = 0; j < res.size(); j++) {
				for(int k = 0; k <= res.get(j).size(); k++) {
					ArrayList<Integer> list = new ArrayList<Integer>(res.get(j));
					list.add(k, num[i]);
					set.add(list);
				}
			}
			res = new ArrayList<ArrayList<Integer>>(set);
		}
		return res;
    }
}
