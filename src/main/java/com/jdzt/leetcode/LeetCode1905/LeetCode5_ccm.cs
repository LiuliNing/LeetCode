using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeetCode5
{
    class Program
    {
        static void Main(string[] args)
        {
            //测试 45
            int[] nums = new int[] { 2, 3, 1, 1, 4 };
            var res = Jump(nums);
            Console.WriteLine(res);
            Console.ReadLine();

            //测试187
            var resStr = FindRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTTACACACACACACACACACACACACACACAC");
            foreach (var item in resStr)
            {
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }

        // 45. 跳跃游戏 II
        // 给定一个非负整数数组，你最初位于数组的第一个位置。
        //数组中的每个元素代表你在该位置可以跳跃的最大长度。
        //你的目标是使用最少的跳跃次数到达数组的最后一个位置。
        //示例:
        //输入: [2,3,1,1,4]
        //输出: 2
        //解释: 跳到最后一个位置的最小跳跃数是 2。
        //     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。

        //解题思路: 
        //贪心算法，查询每条一步局部区域内的最大跳步值，合计跳步值大于或等于数组长度-1时候停止，则计算出步数
        public static int Jump(int[] nums)
        {
            if (nums.Length <= 1) return 0;
            //定义步数，每次循环开始位置，结束到达位置
            int step = 0, start = 0, reach = 0;
            while (reach < nums.Length - 1)
            {
                int farest = 0;
                for (int i = start; i <= reach; i++)
                    farest = Math.Max(farest, i + nums[i]);
                start = reach + 1;
                reach = farest;
                step++;
            }
            return step;
        }

        //187. 重复的DNA序列
        //所有 DNA 由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：“ACGAATTCCG”。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
        //编写一个函数来查找 DNA 分子中所有出现超多一次的10个字母长的序列（子串）。
        //示例:
        //输入: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        //输出: ["AAAAACCCCC", "CCCCCAAAAA"]

        //解题思路： 
        //定义两个集合 ,
        //循环字符串，所有的字符串放入集合A，如果集合A出现重复的，则放入到集合B
        // 最终返回集合B
        public static IList<string> FindRepeatedDnaSequences(string s)
        {
            var result = new HashSet<string>();
            if (s.Length <= 10) return new List<string>(result);
            var allList = new HashSet<string>();
            for (var i = 0; i + 10 <= s.Length; ++i)
            {
                var newStr = s.Substring(i, 10);
                if (allList.Contains(newStr))
                    result.Add(newStr);
                allList.Add(newStr);
            }
            return new List<string>(result);
        }

    }
}
