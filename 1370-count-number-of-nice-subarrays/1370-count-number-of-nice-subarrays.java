class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] nums, int goal) {
        
        if(goal<0){
            return 0;
        }
         int l=0;
        int r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
          sum+=(nums[r]%2);
           while(sum>goal){
             sum=sum-(nums[l]%2);
             l=l+1 ;
           }
           count=count+(r-l+1);
           r=r+1;
        }
        return count;  
    }
}
