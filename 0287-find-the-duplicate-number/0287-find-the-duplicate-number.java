class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int num:nums){
            if(ans.contains(num)){
                return num;
            }else{
                ans.add(num);
            }
        }
        return 0;
    }
}