class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int count =0;
        for(int i=0;i<n;i++){
            if(i==0 && colors[i]!=colors[i+1] && colors[i]!=colors[n-1]) count++;
            if(i==n-1 && colors[i]!=colors[0] && colors[i]!=colors[i-1]) count++;
            if( i!=n-1 && i!=0 && colors[i]!=colors[i+1] && colors[i]!=colors[i-1]) count++;
        }
        return count;
    }
}