/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) return null;
        
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == target) {
                return new int[] {i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return null;
    }
}
// @lc code=end

