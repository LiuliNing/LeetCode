package May.Easy;

/**
 * 替换空格
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 */
public class ReplaceSpaces {
    public static String replaceSpaces(String S, int length) {
        S = S.substring(0, length).replaceAll(" ", "%20");
        return S;
    }

    public static void main(String[] args) {
        String res = replaceSpaces("Mr John Smith    ", 13);
        System.out.println(res);
    }
}
