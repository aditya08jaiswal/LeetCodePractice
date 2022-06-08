class Solution {
    
    public static String reverse(String s){
        
        String res = "";
        for (int i=s.length()-1; i>=0; i--) {
            res += s.charAt(i);
        }
        
        return res;
    }
    public String reverseWords(String s) {
        
        String res = "";
        
        int pos = 0;
        
        for (int i=0; i<=s.length(); i++) {
            
            if (i==s.length()) {
                res += reverse(s.substring(pos, i));
                break;
            }
            
            if (s.charAt(i) == ' ') {
                res += reverse(" " + s.substring(pos, i) );
                pos = i + 1;
                continue;
            }
        }
        return res;
    }
}