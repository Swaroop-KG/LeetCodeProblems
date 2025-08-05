class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;){
                int p=j+1;
                int k=n-1;
                while(p<k){
                 long sum = 1l*nums[i]+nums[j]+nums[p]+nums[k];
                    if(target > sum){
                        p++;
                    } else if(target<sum){
                        k--;
                    }else{
                        ans.add(Arrays.asList(nums[i],nums[j],nums[p],nums[k]));
                        p++;
                        k--;
                        while(p<k && nums[p]==nums[p-1]) p++;
                    }
                }
                j++;
                while(j<n&&nums[j]==nums[j-1]) j++;
            }
        }

       return ans;
    }
}