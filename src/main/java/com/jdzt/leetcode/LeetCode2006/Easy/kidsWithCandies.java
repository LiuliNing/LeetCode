package Easy;


import java.util.ArrayList;
import java.util.List;

/**
 * 1431. 拥有最多糖果的孩子
 * <p>
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //返回集合
        List<Boolean> res = new ArrayList<>();
//        最大糖果数
        int maxCandies = 0;
//        先找出最大的
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }
        //再对比每个数加上目标数，是不是大于最大数
        for (int candy : candies) {
            res.add(candy + extraCandies >= maxCandies);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
}
