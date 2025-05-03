class Solution {
    public int[] findErrorNums(int[] nums) {
            int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        int duplicate = -1;
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicate = num;
            }
            seen.add(num);
            actualSum += num;
        }

        int missing = expectedSum - (actualSum - duplicate);
        return new int[]{duplicate, missing};
    

    }
}