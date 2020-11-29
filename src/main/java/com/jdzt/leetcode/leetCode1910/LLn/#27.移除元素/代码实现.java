package demo1108;

//移除指定元素并返回其数组长度
class removeElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        //同removeDuplicates原理。双指针替换值
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 8, 8, 8};
        int val = 8;
        int res = removeElement(nums, val);
        System.out.println(res);
    }
}