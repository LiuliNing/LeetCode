import java.util.Arrays;

/**
 * 128. 最长连续序列
 * <p>
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * <p>
 * 要求算法的时间复杂度为 O(n)。
 * <p>
 * 示例:
 * <p>
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 */
class longestConsecutive {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 对数组排序。
        // 用了sort就不符合题意复杂度为 O(n)了
        Arrays.sort(nums);
        // 定义变量记录最大长度和当前遍历的连续序列长度。
        int max = 1, cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                // 从头开始遍历数组，如果前一个数字 +1 等于当前数字，则实时长度 +1 。
                if (nums[i - 1] + 1 == nums[i]) {
                    cur++;
                } else {
                    // 当序列不连续后比较记录当前为止最长的序列长度，并恢复实时长度为 1。
                    max = Math.max(max, cur);
                    cur = 1;
                }
            }
        }
        // 最终遍历完成后，比较得出最长的连续序列长度。
        return Math.max(max, cur);
    }


    public static void main(String[] args) {
        longestConsecutive longestConsecutive = new longestConsecutive();
        int nums[] = {1, 2, 4, 5, 6, 3, 8};

        int i = longestConsecutive.longestConsecutive(nums);

        System.out.println(i);
    }
}
