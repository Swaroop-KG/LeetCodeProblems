class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int count=1;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                if(count < 2){
                    count++;
                    i++;
                    nums[i]=nums[j];
            }
        }else{
                i++;
                nums[i]=nums[j];
                count=1;
            }
        
    }
    return i+1;
}
}