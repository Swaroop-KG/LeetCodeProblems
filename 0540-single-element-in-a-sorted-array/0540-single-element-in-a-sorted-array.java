class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            // Make mid even to compare with next element (mid, mid+1) as a pair
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                st = mid + 2;
            } else {
                end = mid;
            }
        }

        return nums[st];
    }
}
