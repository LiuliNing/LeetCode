package May.Easy;

import java.util.Arrays;

/**
 * 判定是否互为字符重排
 * https://leetcode-cn.com/problems/check-permutation-lcci/
 */
public class CheckPermutation {
    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        // 利用arrays的sort方法，排序后，直接比较是否相同
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        // new string目的是：比较是否相同而不是内存地址
        return new String(c1).equals(new String(c2));
    }

    public static void main(String[] args) {
        boolean b = CheckPermutation("abc", "bcaa");
        System.out.println(b);

    }

}
