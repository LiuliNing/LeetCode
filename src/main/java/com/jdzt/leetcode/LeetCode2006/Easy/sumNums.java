package Easy;

/**
 * 面试题64. 求1+2+…+n
 * <p>
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 * <p>
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: n = 3
 * 输出: 6
 * 示例 2：
 * <p>
 * 输入: n = 9
 * 输出: 45
 *  
 * <p>
 * 限制：
 * <p>
 * 1 <= n <= 10000
 */
public class sumNums {
    int res = 0;

    //    n > 1 && sumNums(n - 1) 当 n = 1 时 n > 1 不成立 ，此时 “短路” ，终止后续递归
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
