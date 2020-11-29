package demo1108;

//删除排序数组中的重复项并返回长度
class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 && nums == null) {
            return 0;
        }
        //双指针，比较，如果不同则替换值
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                //看题解出现的一个小细节。再次判断指针大小
                if (j - i > 1) {
                    nums[i + 1] = nums[j];
                    i++;
                }
            }
            j++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}
