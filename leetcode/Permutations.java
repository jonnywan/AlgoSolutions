/*
 * Given a collection of numbers, return all possible permutations.

 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
import java.util.*;

public class Permutations {
/*************************** updated 2013/11/29 ******************************/

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length == 0)
            return res;
        res.add(new ArrayList<Integer>());
        for(int i = 0; i < num.length; i++) {
            ArrayList<ArrayList<Integer>> newRes = new ArrayList<ArrayList<Integer>>();
            for(int j = 0; j < res.size(); j++) {
                for(int k = 0; k <= res.get(j).size(); k++) {
                    ArrayList<Integer> list = new ArrayList<Integer>(res.get(j));
                    list.add(k, num[i]);
                    newRes.add(list);
                }
            }
            res = newRes;
        }
        return res;
    }

/**************************** updated 2014/01/05 *****************************/

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(res, list, num);
        return res;
    }

    public void dfs(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, 
            int[] num) {
        if(list.size() == num.length) {
            res.add(new ArrayList<Integer>(list));
            return ;
        }
        for(int i = 0; i < num.length; i++) {
            if(list.indexOf(num[i]) == - 1) {
                list.add(num[i]);
                dfs(res, list, num);
                list.remove(list.size() - 1);
            }
        }
    }
}
