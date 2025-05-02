import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return set.first(); // max
        }

        // Remove first two largest elements to get the third
        set.pollFirst(); // remove max
        set.pollFirst(); // remove second max
        return set.first(); // third max
    }
}
