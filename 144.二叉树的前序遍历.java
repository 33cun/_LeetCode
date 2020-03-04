/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/description/
 *
 * algorithms
 * Medium (64.20%)
 * Likes:    208
 * Dislikes: 0
 * Total Accepted:    69.9K
 * Total Submissions: 108.8K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的 前序 遍历。
 * 
 * 示例:
 * 
 * 输入: [1,null,2,3]  
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  3 
 * 
 * 输出: [1,2,3]
 * 
 * 
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
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

    /** Recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;
        
        preorderTraversal(root, result);

        return result;
    }

    private List<Integer> preorderTraversal(TreeNode node, List<Integer> list) {

        if (node != null) {
            list.add(node.val);
            
            if (node.left != null) {
                preorderTraversal(node.left, list);
            }

            if (node.right != null) {
                preorderTraversal(node.right, list);
            }
        }

        return list;
    }*/

    /** Iteration */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                result.add(root.val);
                root = root.left;
            }

                root = stack.pop();
                root = root.right;
        }

        return result;
    }
}
// @lc code=end

