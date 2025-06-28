class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (l < g.length && r < s.length) {
            if(g[l]<=s[r]){
                l=l+1;
            }
            r=r+1;
        }
        return l;
    }
}