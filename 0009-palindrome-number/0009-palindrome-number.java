class Solution {
    
    public  static boolean isPalindrome(int x) {
        if(x<0){
           return false;
        }
        int n=x;
        int reverse=0;
        while(n>0){
            int d=n%10;
             reverse =reverse*10 +d;
            n=n/10;
           

        }
        if(x==reverse){
            return true;

        }else{
            return false;
        }
    }
    public static void main(String[] args){
     System.out.println( isPalindrome(121))  ;
    }
    
}
