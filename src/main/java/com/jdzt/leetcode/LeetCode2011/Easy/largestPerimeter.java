package com.jdzt.leetcode.LeetCode2011.Easy;

/**
 * @author jdzt.lln
 * @Description:
 * @date 2020/11/29  20:04
 */

import java.util.Arrays;

/**
 * 976. 三角形的最大周长
 * https://leetcode-cn.com/problems/largest-perimeter-triangle/
 *
 * **/
public class largestPerimeter {
    public static int largestPerimeter(int[] A) {
        // 先排序，在倒叙挪动指针，三角形两边之和大于第三边
        Arrays.sort(A);
        int length = A.length - 1;
        for (int i = length; i >2 ; i--) {
            if (A[i - 1] + A[i - 2] > A[i]) {
                return A[i - 1] + A[i - 2] + A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int A[] = new int[]{1,4,7,9,11,15};
        System.out.println(largestPerimeter(A));
    }

}
