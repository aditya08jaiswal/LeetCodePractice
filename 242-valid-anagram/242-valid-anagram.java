class Solution {
    
    private String sortedString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        String ns = sortedString(s);
        String nt = sortedString(t);

        return ns.equals(nt);
        
    }
}