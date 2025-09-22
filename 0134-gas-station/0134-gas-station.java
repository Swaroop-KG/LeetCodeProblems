class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0;
        int totcost=0;
        for(int val:gas){
            totgas +=val;
        }
        for(int val:cost){
            totcost+=val;
        }
        if(totgas<totcost) return -1;
        int start=0;
        int cur=0;
        for(int i=0;i<gas.length;i++){
            cur+=gas[i]-cost[i];
            if(cur<0){
                start=i+1;
                cur=0;
            }
        }
        return start;
    }
}