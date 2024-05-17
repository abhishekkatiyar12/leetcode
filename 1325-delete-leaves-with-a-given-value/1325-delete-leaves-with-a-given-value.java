/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return remove(root, target);
    }

    private TreeNode remove(TreeNode node, int target) {
        if (node == null) {
            return null;
        }

        // Recursively remove leaf nodes from the left and right subtrees
        node.left = remove(node.left, target);
        node.right = remove(node.right, target);

        // If the current node is a leaf and its value equals target, delete it
        if (node.left == null && node.right == null && node.val == target) {
            return null;
        }

        return node;
    }
}
