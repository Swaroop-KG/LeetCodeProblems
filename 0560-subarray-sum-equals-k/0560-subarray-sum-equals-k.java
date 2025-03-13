import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        int preSum = 0, count = 0;

        prefixSumCount.put(0, 1); 

        for (int i = 0; i < n; i++) {
            preSum += nums[i];

            int targetPrefixSum = preSum - k;
            count += prefixSumCount.getOrDefault(targetPrefixSum, 0);

            prefixSumCount.put(preSum, prefixSumCount.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
