/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

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
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.

 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, where '#' signifies a path 
 * terminator where no node exists below.

 * Here's an example:

 *    1
 *   / \
 *  2   3
 *     /
 *    4
 *     \
 *      5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
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
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode p, TreeNode q) {
        if(p == null && q == null || p != null && q == null || p == null && q != null) 
            return p == null && q == null;
        return (p.val == q.val) && isSymmetricHelper(p.left, q.right) && isSymmetricHelper(p.right, q.left);
    } 

/***********************************************************************************************************/

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
