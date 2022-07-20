package com.jdzt.leetcode.LeetCode2207.controller;

/**
 * https://leetcode.cn/problems/running-sum-of-1d-array/
 * @author lln
 * @date 2022/7/19 12:52
 */
public class runningSum1480 {

    class Solution {
        public int[] runningSum(int[] nums) {
            int[] res = new int[nums.length];
            res[0] = nums[0];
            for (int i = 1 ; i < nums.length ; i++) {
                res[i] = res[i - 1] + nums[i];
            }
            return res;
        }

    }

}
