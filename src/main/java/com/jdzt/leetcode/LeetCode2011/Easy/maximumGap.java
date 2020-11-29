package Easy;

import java.util.Arrays;

/**
 * 164. 最大间距
 * https://leetcode-cn.com/problems/maximum-gap/
 * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 * <p>
 * 如果数组元素个数小于 2，则返回 0。
 * 示例 1:
 * <p>
 * 输入: [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 * 示例 2:
 * <p>
 * 输入: [10]
 * 输出: 0
 * 解释: 数组元素个数小于 2，因此返回 0。
 * 说明:
 * <p>
 * 你可以假设数组中所有元素都是非负整数，且数值在 32 位有符号整数范围内。
 * 请尝试在线性时间复杂度和空间复杂度的条件下解决此问题。
 */
public class maximumGap {
    public static int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int start = nums[0];
        for (int num : nums) {
            max = Math.max(max, num - start);
            start = num;
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{0, 1, 2, 4, 5, 7, 8, 3, 10};
        int i = maximumGap(nums);
        System.out.println(i);
    }

}
