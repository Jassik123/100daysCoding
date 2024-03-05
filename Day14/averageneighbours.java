class Solution {
     public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 1;
        while (i < n - 1) {
            if (i>0 && nums[i - 1] + nums[i + 1] == 2 * nums[i]) {
                swap(nums, i, i + 1);
                i--;
            } else {
                i++;
            }
        }
        return nums;
    }
}