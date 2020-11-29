package May.Easy;

import java.util.Arrays;

/**
 * 字符串轮转
 * https://leetcode-cn.com/problems/string-rotation-lcci/
 */
public class isFlipedString {

    public static boolean isFlipedString(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean res = Arrays.equals(c1, c2);
        return res;
    }


    public static void main(String[] args) {
        boolean res = isFlipedString("abdc", "bca");
        System.out.println(res);
    }
}
