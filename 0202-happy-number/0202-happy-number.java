class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedInteger = new HashSet<>();
        while (n != 1 && !usedInteger.contains(n)) {
            usedInteger.add(n); 
            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10); 
                n /= 10;
            }
            n = sum;
        }
        return n == 1; 
    }
}