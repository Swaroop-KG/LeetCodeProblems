class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=0;
        int i=0;
        int j=0;
        int len=nums.length;
        int res=Integer.MAX_VALUE;
        while(i<len && j<len)
        {
            count+=nums[j];
            while(i<len && count>=target)
                {
                    res=Math.min(res,j-i+1);
                    count-=nums[i];
                    i++;
                }
              j++;

            }
        if(res==Integer.MAX_VALUE)return 0;
        return res;

    }
}