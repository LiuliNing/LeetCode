package com.jdzt.leetcode.LeetCode2207.controller;

/**
 * https://leetcode.cn/problems/binary-search/
 * @author jdzt.lln
 * @date 2022/7/19/019 22:39
 * @version V1.0
 */
public class search704 {

    class Solution {
        public int search(int[] nums , int target) {
            int left  = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > left) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return - 1;
        }
    }
}
