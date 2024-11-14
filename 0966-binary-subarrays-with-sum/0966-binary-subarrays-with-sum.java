class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int pre = 0,l = 0,r = 0,sum = 0,res = 0;
        boolean isPre = true;
        while(r < nums.length) {
            if(nums[r] == 1) 
                isPre = false;

            sum += nums[r];
            while(sum > goal && l < r) {
                pre = 0;
                sum -= nums[l];
                l++;
                if(sum == goal && l < r) {
                    while(nums[l] == 0) {
                        pre++;
                        l++;
                    }
                }
                if(l == r) {
                    isPre = true;
                }
            }
            
            if (sum == goal) {
                res += pre + 1;
            }
            if(isPre && nums[r] == 0) {
                pre++;
            }
            r++;
            System.out.println(res);
        }
        
        return res;
    }
}