/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/description/
 *
 * algorithms
 * Hard (70.21%)
 * Likes:    227
 * Dislikes: 0
 * Total Accepted:    52K
 * Total Submissions: 74K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的 后序 遍历。
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
 * 输出: [3,2,1]
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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) return list;
        
        postorderTraversal(root, list);

        return list;
    }

    private List<Integer> postorderTraversal(TreeNode node, List<Integer> list) {

        if (node != null) {
            
            if (node.left != null) {
                postorderTraversal(node.left, list);
            }

            if (node.right != null) {
                postorderTraversal(node.right, list);
            }

            list.add(node.val);
        }

        return list;
    }
}
// @lc code=end

