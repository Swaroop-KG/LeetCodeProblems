class Solution {
     boolean isAlphaNumer(char s){
        
            if(s>='0' && s<='9' || Character.toLowerCase(s)>= 'a' && Character.toLowerCase(s) <= 'z'){
                return true;
            }
            return false;
        }
    public boolean isPalindrome(String s) {
       int n=s.length();
       String c = s.toLowerCase();
       int start=0;
       int end=n-1;
       while(start<=end){
        if(!isAlphaNumer(c.charAt(start))) {
            start++;
            continue;
        }
        if(!isAlphaNumer(c.charAt(end))){
            end--;
            continue;
        }
        
        if(c.charAt(start)!= c.charAt(end)){
            return false;
        }
        start++;
        end--;
       }
       return true;

    }
}