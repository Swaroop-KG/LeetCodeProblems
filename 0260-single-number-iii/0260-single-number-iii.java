class Solution {
    public int[] singleNumber(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       
       for(int num:nums){
        if(!set.contains(num)){
            set.add(num);
        }
        else{
            set.remove(num);
        }
       }
       int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
       return arr;
    }
}