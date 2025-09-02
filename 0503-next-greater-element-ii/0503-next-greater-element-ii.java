class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans= new int[nums.length];
        Stack<Integer> stk=new Stack<>();
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            while(stk.size()>0 && nums[stk.peek()]<=nums[i%n]){
                stk.pop();
            }
          ans[i%n]=stk.empty() ? -1:nums[stk.peek()];
            stk.push(i%n);
        }
        return ans;
    }
}