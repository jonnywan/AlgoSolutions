/*
 * Given n pairs of parentheses, write a function to generate all combinations 
 * of well-formed parentheses.

 * For example, given n = 3, a solution set is:

 * "((()))", "(()())", "(())()", "()(())", "()()()" 
 */
public class GenerateParentheses {
/************************** updated 2013/12/10 *******************************/

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        helper(res, "", n, n);
        return res;
    }
    
    public void helper(ArrayList<String> array, String s, int left, int right) {
        if(left == 0 && right == 0)
            array.add(s);
        if(left > 0)
            helper(array, s + "(", left - 1, right);
        if(left < right)
            helper(array, s + ")", left, right - 1);
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
