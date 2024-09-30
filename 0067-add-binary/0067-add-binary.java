class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int c = 0;
        StringBuilder res = new StringBuilder();

        while (n1 >= 0 || n2 >= 0 || c > 0) {
            int t1 = 0, t2 = 0, sum;
            
            if (n1 >= 0)
                t1 = a.charAt(n1--) - '0';
            if (n2 >= 0)
                t2 = b.charAt(n2--) - '0';
            
            sum = t1 + t2 + c;
            c = sum / 2;  
            sum = sum % 2;  
            
            res.append(sum);
        }

        return res.reverse().toString();
    }
}