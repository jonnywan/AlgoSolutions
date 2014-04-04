/*
 * Given a string containing just the characters '(' and ')', find the length 
 * of the longest valid (well-formed) 
 * parentheses substring.

 * For "(()", the longest valid parentheses substring is "()", which has 
 * length = 2.

 * Another example is ")()())", where the longest valid parentheses substring 
 * is "()()", which has length = 4.
 */
public class LongestValidParentheses {

/**************************** updated 2014.04.04 *****************************/

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int answer = 0;
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else if (stack.isEmpty())
                left = i;
            else {
                stack.pop();
                answer = Math.max(answer,
                        i - (stack.isEmpty() ? left : stack.peek()));
            }
        }
        return answer;
    }

}
