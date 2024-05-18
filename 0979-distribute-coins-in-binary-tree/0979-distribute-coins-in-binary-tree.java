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
    private int moves = 0;
    public int distributeCoins(TreeNode root) {
        postOrder(root);
        return moves;
    }

    private int postOrder(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftExcess = postOrder(node.left);
        int rightExcess = postOrder(node.right);

        // Calculate current node's excess coins
        int nodeExcess = node.val - 1 + leftExcess + rightExcess;

        // The number of moves is increased by the absolute value of excess coins from/to children
        moves += Math.abs(leftExcess) + Math.abs(rightExcess);

        return nodeExcess;
    }
    }