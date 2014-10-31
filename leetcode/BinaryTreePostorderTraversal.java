/*
 * Given a binary tree, return the postorder traversal of its nodes' values.

 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [3,2,1].

 * Note: Recursive solution is trivial, could you do it iteratively?
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePostorderTraversal {

/**************************** updated 20141101 *******************************/

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) { 
            result = postorderTraversal(root.left);
            result.addAll(postorderTraversal(root.right));
            result.add(root.val);
        }
        return result;
    }

/*****************************************************************************/ 

    public ArrayList<Integer> postorderTraversal_2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode next =stack.peek();
            if(next.left == root || next.right == root || (next.left == null && next.right == null)) {
                stack.pop();
                res.add(next.val);
                root = next;
            }
            else {
                if(next.right != null)
                    stack.push(next.right);
                if(next.left != null)
                    stack.push(next.left);
            }
        }
        return res;
    }   
}
