/*
 * Given a binary tree, find its minimum depth.

 * The minimum depth is the number of nodes along the shortest 
 * path from the root node down to the nearest leaf node.
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
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) 
            return 0;
        if(root.left == null || root.right == null)
            return 1 + Math.max(minDepth(root.left), minDepth(root.right));
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

/************************** updated 2013/12/08/ ****************************/

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int res = 0;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            res++;
            Queue<TreeNode> next = new LinkedList<TreeNode>();
            while(!nodes.isEmpty()) {
                TreeNode p = nodes.poll();
                if(p.left == null && p.right == null)
                    return res;
                if(p.left != null)
                    next.add(p.left);
                if(p.right != null)
                    next.add(p.right);
            }
            nodes = next;
        }
        return res;
    }
}
