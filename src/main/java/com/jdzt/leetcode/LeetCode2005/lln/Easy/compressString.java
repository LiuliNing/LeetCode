package May.Easy;

/**
 * 字符串压缩。
 * <p>
 * https://leetcode-cn.com/problems/compress-string-lcci/
 * <p>
 * 利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 * <p>
 * 示例1:
 * <p>
 * 输入："aabcccccaaa"
 * 输出："a2b1c5a3"
 * 示例2:
 * <p>
 * 输入："abbccd"
 * 输出："abbccd"
 * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 * 提示：
 * <p>
 * 字符串长度在[0, 50000]范围内。
 */
public class compressString {

    public String compressString(String S) {
        //如果原字母串长度为<=2,则新字母串长度无论如何不会小于原字母串
        if (S.length() <= 2 || S == null) {
            return S;
        }
        //先默认拼接第一个字母
        StringBuffer sb = new StringBuffer().append(S.charAt(0));
        //需要拼接的字母后的值
        int temp = 1;
        for (int i = 1; i < S.length(); i++) {
            // 如果前后字母相等，则将temp增加值
            if (S.charAt(i) == S.charAt(i - 1)) {
                temp++;
            } else {//否则，拼接temp值和之后的新的字母值，归位temp
                sb.append(temp).append(S.charAt(i));
                temp = 1;
            }
        }
        //判断长短，比修改后长则返回原字母串
        return sb.append(temp).length() < S.length() ? sb.toString() : S;
    }
}
