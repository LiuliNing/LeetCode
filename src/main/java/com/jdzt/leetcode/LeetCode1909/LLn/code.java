package com.jdzt.leetcode.LeetCode1909.LLn;

import java.util.Arrays;

class code {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);//排序数组
        int ans = 0;//定义结果集
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];//三数之和
                //如果sum与标值已经比ans与标值的绝对值小了，代表更接近标值，sum赋值给ans
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                //如果三数之和小于标值，因为数组有序，则将start值++
                if (sum < target) {
                    start++;
                    //同理，将end--
                } else if (sum > target) {
                    end--;
                    //相等的话直接返回ans就行了
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }
}