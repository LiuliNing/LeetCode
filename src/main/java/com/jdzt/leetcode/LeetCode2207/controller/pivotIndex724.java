package com.jdzt.leetcode.LeetCode2207.controller;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/find-pivot-index/
 * @author jdzt.lln
 * @date 2022/7/19/019 22:18
 * @version V1.0
 */
public class pivotIndex724 {

    class Solution {
        public int pivotIndex(int[] nums) {
            final int sum = Arrays.stream(nums).sum();
            int left = 0;
            for (int i = 0 ; i < nums.length ; i++) {
                if (left * 2 + nums[i] == sum) {
                    return i;
                }
                left += nums[i];
            }
            return - 1;

        }
    }
}
