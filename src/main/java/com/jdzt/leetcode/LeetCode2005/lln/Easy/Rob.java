package May.Easy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 198. 打家劫舍
 * <p>
 * https://leetcode-cn.com/problems/house-robber/
 * <p>
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 * <p>
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */
public class Rob {
    public static void main(String[] args) {
        Rob rob = new Rob();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        rob.rob(nums);
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        list.forEach(e -> System.out.println(e));
    }

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[len];
    }
}
//	public int rob(int[] nums) {
//		if (nums == null || nums.length == 0) {
//			return 0;
//		}
//		int length = nums.length;
//		//如果只有1个则直接取，有两个则取最大值
//		switch (length) {
//			case 0 :
//				return 0;
//			case 1 :
//				return nums[0];
//			case 2 :
//				return Math.max(nums[0], nums[1]);
//		}
//		int[] dp = new int[length + 1];
//		dp[0] = 0;
//		dp[1] = nums[0];
//		for(int i = 2; i <= length; i++) {
//			dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
//		}
//		return dp[length];
//	}
//}
/**
 * public int rob(int[] nums) {
 * int pre = 0, cur = 0, tmp;
 * for(int num : nums) {
 * tmp = cur;
 * cur = Math.max(pre + num, cur);
 * pre = tmp;
 * }
 * return cur;
 * }
 * <p>
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/house-robber/solution/da-jia-jie-she-dong-tai-gui-hua-jie-gou-hua-si-lu-/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
