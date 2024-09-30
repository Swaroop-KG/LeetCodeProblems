class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        for(int right=0,left=0;right <s.length();right++){
            int indexofFirst= s.indexOf(s.charAt(right),left);

            if(indexofFirst!=right){
                left=indexofFirst+1;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
        
    }
}