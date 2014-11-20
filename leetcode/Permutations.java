/*
 * Given a collection of numbers, return all possible permutations.

 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */

public class Permutations {

    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < num.length; i++) {
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for (List<Integer> list : result) {
                for (int j = 0; j <= list.size(); j++) {
                    List<Integer> item = new ArrayList<Integer>(list);
                    item.add(j, num[i]);
                    tmp.add(item);
                }
            }
            result = tmp;
        }
        return result;
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
