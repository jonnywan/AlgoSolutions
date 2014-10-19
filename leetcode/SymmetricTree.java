/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric 
 * around its center).

 * For example, this binary tree is symmetric:

 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following is not:

 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
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
import java.util.*;

public class SymmetricTree {
/**************************** updated 20141020 *******************************/

    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode tree1, TreeNode tree2) {
        return tree1 == null && tree2 == null || 
            tree1 != null &&tree2 != null && tree1.val == tree2.val 
            && isSymmetricHelper(tree1.left, tree2.right) 
            && isSymmetricHelper(tree1.right, tree2.left);
    }

/*****************************************************************************/

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()) {
            TreeNode lNode = queue.poll();
            TreeNode rNode = queue.poll();
            if(lNode == null && rNode == null)
                continue;
            if(lNode == null || rNode == null || lNode.val != rNode.val)
                return false;
            queue.offer(lNode.left);
            queue.offer(rNode.right);
            queue.offer(lNode.right);
            queue.offer(rNode.left);
        }
        return true;
    }
}
