class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        
        int start = 0, end = s.length()-1;
        char cStart, cEnd; 
        while (start <= end) {
            cStart = Character.toLowerCase(s.charAt(start));
            cEnd = Character.toLowerCase(s.charAt(end));
           
            if (!Character.isLetterOrDigit(cStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(cEnd)) {
                end--;
            } else {
                if (cStart != cEnd) {
                    return false;
                }
                start++;
                end--;
            }
            
        }
        
        return true;
    }
}