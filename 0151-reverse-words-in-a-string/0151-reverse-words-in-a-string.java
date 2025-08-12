class Solution {
    public String reverseWords(String s) {
        String ans ="";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
       
          for (int i = 0; i < sb.length(); i++) {
            StringBuilder word = new StringBuilder();
            while (i < sb.length() && sb.charAt(i) != ' ') {
                word.append(sb.charAt(i));
                i++;
            }
            word.reverse();
            
        if(word.length()>0){
            ans+=" "+word;
        }
        }
        return ans.trim();
    }
}