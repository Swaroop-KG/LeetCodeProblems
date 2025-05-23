class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;  // duplicate found
            }
            set.add(num);
        }
        
        return false;  // no duplicate
    }
}
