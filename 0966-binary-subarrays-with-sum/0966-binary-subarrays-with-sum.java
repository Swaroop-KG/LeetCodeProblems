import java.util.HashMap;

public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); 

        int currentSum = 0, count = 0;

        for (int num : nums) {
            currentSum += num;

            count += prefixCount.getOrDefault(currentSum - goal, 0);

            prefixCount.put(currentSum, prefixCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
