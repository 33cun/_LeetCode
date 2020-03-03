import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 *
 * algorithms
 * Medium (70.24%)
 * Likes:    404
 * Dislikes: 0
 * Total Accepted:    106.7K
 * Total Submissions: 151.9K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的中序 遍历。
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
 * 输出: [1,3,2]
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;
        
        inorderTraversal(root, list);

        return list;
    }

    private List<Integer> inorderTraversal(TreeNode node, List<Integer> list) {

        if (node != null) {
            if (node.left != null) {
                inorderTraversal(node.left, list);
            }
            
            list.add(node.val);

            if (node.right != null) {
                inorderTraversal(node.right, list);
            }
        }

        return list;
    }
}
// @lc code=end

