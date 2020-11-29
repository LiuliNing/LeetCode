package May.Hard;

import java.util.Arrays;
import java.util.Stack;

/**
 * 84. 柱状图中最大的矩形
 * <p>
 * https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
 */
public class largestRectangleArea {
    public static void main(String[] args) {
        int[] arrays = {2, 1, 5, 6, 2, 3};
        int[] arrays2 = {2, 1, 5, 6, 2, 3};

        System.out.println(largestRectangleArea(arrays));
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        Stack<Integer> mono_stack = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                right[mono_stack.peek()] = i;
                mono_stack.pop();
            }
            left[i] = (mono_stack.isEmpty() ? -1 : mono_stack.peek());
            mono_stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }
}
