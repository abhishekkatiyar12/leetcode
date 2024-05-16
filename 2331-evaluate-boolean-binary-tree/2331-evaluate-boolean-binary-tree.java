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
class Solution {
    public boolean evaluateTree(TreeNode root) {
               if (root == null) {
            return false;
        }

        // If the node is a leaf node
        if (root.left == null && root.right == null) {
            return root.val == 1; // True if val is 1, False if val is 0
        }

        // Recursively evaluate the left and right children
        boolean leftResult = evaluateTree(root.left);
        boolean rightResult = evaluateTree(root.right);

        // Evaluate based on the node's value (2 for OR, 3 for AND)
        if (root.val == 2) {
            return leftResult || rightResult; // OR operation
        } else if (root.val == 3) {
            return leftResult && rightResult; // AND operation
        }

        return false; // Default case (shouldn't be reached in a valid tree)
    }
        
    }
