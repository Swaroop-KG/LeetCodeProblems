class Solution {
    public boolean isPowerOfThree(int n) {
       if(n==0 || n==2) return false;
       else if(n==1) return true;
       else{
        while(n%3==0){
            
            n=n/3;
        }
            if(n==1) return true;
            else if(n==3) return true;
            else return false;
        
       }
      
    }
}