package com.jdzt.leetcode.LeetCode2207.controller;

import java.util.Arrays;

/**
 *
 * @author lln
 * @date 2022/7/19 12:46
 */
public class merge88 {
    class Solution {
        public void merge(int[] nums1 , int m , int[] nums2 , int n) {
            int p1   = m - 1, p2 = n - 1;
            int tail = m + n - 1;
            int cur;
            while (p1 >= 0 || p2 >= 0) {
                if (p1 == - 1) {
                    cur = nums2[p2--];
                } else if (p2 == - 1) {
                    cur = nums1[p1--];
                } else if (nums1[p1] > nums2[p2]) {
                    cur = nums1[p1--];
                } else {
                    cur = nums2[p2--];
                }
                nums1[tail--] = cur;
            }
        }
    }

    public void merge(int[] nums1 , int m , int[] nums2 , int n) {
        for (int i = 0 ; i != n ; ++ i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
