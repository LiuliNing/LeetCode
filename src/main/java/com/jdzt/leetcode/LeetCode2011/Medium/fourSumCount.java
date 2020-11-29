package com.jdzt.leetcode.LeetCode2011.Medium;


import java.util.HashMap;
import java.util.Map;

/**
 * 454. 四数相加 II
 * https://leetcode-cn.com/problems/4sum-ii/
 *
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 *
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
 *
 * 例如:
 *
 * 输入:
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 *
 * 输出:
 * 2
 *
 * 解释:
 * 两个元组如下:
 * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 */
public class fourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> ab = new HashMap<>();
        int res = 0;
        for (int a : A) {
            for (int b : B) {
                //getOrDefault:当Map集合中有这个key时，就使用这个key对应的value值，如果没有就使用默认值defaultValue
                ab.put(a + b, ab.getOrDefault(a + b, 0) + 1);
            }
        }
        for (int c : C) {
            for (int d : D) {
                if (ab.containsKey(-c - d)) {
                    res += ab.get(-c - d);
                }
            }
        }
        return res;
    }
}
