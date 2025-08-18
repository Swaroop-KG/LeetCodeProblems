class Solution {
boolean isFreqSame(int[] freq1,int[] freq2){
    for(int i=0;i<26;i++){
       if(freq1[i] != freq2[i]){  
            return false; 
        }
       
    }
    return true;
}
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26] ;
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int windSize=s1.length();
        for(int i=0;i<s2.length();i++){
            int windind=0;
            int[] windfreq = new int[26];
            int idx=i;
            while(windind<windSize && idx <s2.length()){
                windfreq[s2.charAt(idx)-'a']++;
                 windind++;
    idx++;
            }
            if(isFreqSame(freq,windfreq)){
                return true;
            }
        }
        return false;
    }
}