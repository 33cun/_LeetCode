import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 *
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (72.20%)
 * Likes:    462
 * Dislikes: 0
 * Total Accepted:    126.7K
 * Total Submissions: 175.5K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，找出其最大深度。
 * 
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 
 * 说明: 叶子节点是指没有子节点的节点。
 * 
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 返回它的最大深度 3 。
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int levelSize = 1, height = 0;

        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            levelSize--;

            if (curNode.left != null) {
                queue.offer(curNode.left);
            }

            if (curNode.right != null) {
                queue.offer(curNode.right);
            }

            if (levelSize == 0) {
                levelSize = queue.size();
                height++;
            }
        }

        return height;
    }
}
// @lc code=end

