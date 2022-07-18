package com.jdzt.leetcode.LeetCode2207.controller;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.cn/problems/contains-duplicate/
 * @author lln
 * @date 2022/7/18 8:35
 */
public class ContainsDuplicate217 {
    /**
     * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
     *  
     *
     * 示例 1：
     *
     * 输入：nums = [1,2,3,1]
     * 输出：true
     * 示例 2：
     *
     * 输入：nums = [1,2,3,4]
     * 输出：false
     * 示例 3：
     *
     * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
     * 输出：true
     *  
     *
     * 提示：
     *
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/contains-duplicate
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (! set.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }
    class Solution2 {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0 ; i < nums.length - 1 ; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
            return false;
        }
    }
}
