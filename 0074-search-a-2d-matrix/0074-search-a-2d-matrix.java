class Solution {
    public boolean coloumnans(int[][] matrix,int target,int mid){
        int lowc=0;
        int highc=matrix[0].length-1;
        while(lowc<=highc){
           int midc=lowc+(highc-lowc)/2;
            if(matrix[mid][midc]==target){
                return true;
            }
            else if(target<matrix[mid][midc]){
               highc=midc-1;
            }
            else{
                lowc=midc+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n = matrix[0].length;
        int lowr=0;
        int highr=m-1;
        while(lowr<=highr){
          int  midr=lowr+(highr-lowr)/2;
            if(target<=matrix[midr][n-1] &&  matrix[midr][0]<=target){
                return coloumnans(matrix,target,midr);
            }else if(target<matrix[midr][0]){
                highr=midr-1;
            }else{
                lowr=midr+1;
            }
        }
        return false;
    }
}