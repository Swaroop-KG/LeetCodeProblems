class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end =x;
        int res=0;
        if (x == 0 || x == 1) {
            return x;
        }

        while(start<=end){
            int mid=start +(end-start)/2;
            if(mid<=x/mid){
                start=mid+1;
                res = mid;

            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
}