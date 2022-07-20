package com.jdzt.leetcode.LeetCode2207.controller;

import java.util.HashMap;

/**
 * https://leetcode.cn/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
 * @author lln
 * @date 2022/7/19 12:31
 */
public class twoSum1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0 ; i < nums.length ; i++) {
                if (hashMap.containsKey(target - nums[i])) {
                    return new int[] {hashMap.get(target - nums[i]) , i};
                }
                hashMap.put(nums[i] , i);
            }
            return new int[0];
        }
    }
}
