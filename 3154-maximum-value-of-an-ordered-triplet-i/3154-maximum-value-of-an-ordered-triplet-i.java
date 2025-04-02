class Solution {
    public long maximumTripletValue(int[] nums) {
       long result=0;
       long maximum=0;
       long difference=0;
       for(int i=0;i<nums.length;i++){
        result= Math.max(result,nums[i]*difference);
        maximum=Math.max(maximum,nums[i]);
        difference=Math.max(difference,maximum-nums[i]);
       }
       return result;
    }
}