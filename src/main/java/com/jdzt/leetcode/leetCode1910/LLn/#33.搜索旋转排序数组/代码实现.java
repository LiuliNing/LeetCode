package demo1108;

class search {
    public static int search(int nums[], int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return target;
            }
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int nums[] = {3, 4, 5, 1, 2};
        int target = 3;
        int search = search(nums, target);
        System.out.println(search);
    }
}
