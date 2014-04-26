public class FourSum {
    
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        HashSet<ArrayList<Integer>> hSet = new HashSet<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int k = j + 1;
                int p = num.length - 1;
                while (k < p) {
                    int sum = num[i] + num[j] + num[k] + num[p];
                    if (sum > target) 
                        p--;
                    else if (sum < target)
                        k++;
                    else {
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[k]);
                        list.add(num[p]);
                        if (!hSet.contains(list)) 
                            hSet.add(list);
                        k++;
                        p--;
                    }
                }
            }
        }
        return new ArrayList<ArrayList<Integer>>(hSet);
    }
}
