/*
 * Given n pairs of parentheses, write a function to generate all combinations 
 * of well-formed parentheses.

 * For example, given n = 3, a solution set is:

 * "((()))", "(()())", "(())()", "()(())", "()()()" 
 */
public class GenerateParentheses {
/************************** updated 2013/12/10 *******************************/

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        dfs(result, "", n, n);
        return result;
    }

    public void dfs(List<String> list, String s, int left, int right) {
        if (left < 0 || left > right)
            return;
        if (left == 0 && right == 0)
            list.add(s);
        dfs(list, s + "(", left - 1, right);
        dfs(list, s + ")", left, right - 1);
    }

/*****************************************************************************/

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        if(n == 0) 
            res.add("");
        else if(n == 1) 
            res.add("()");
        else {
            for(int i = 0; i < n; i++) 
                for(String inner : generateParenthesis(i)) 
                    for(String outer : generateParenthesis(n - 1 - i))
                        res.add("(" + inner + ")" + outer);
        }
        return res;
    }
}
