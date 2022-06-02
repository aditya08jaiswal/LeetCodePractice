class Solution {
    public int strStr(String haystack, String needle) {
        
        int nLen = needle.length();
        int hLen = haystack.length();
        
        if (nLen > hLen) {
            return -1;
        }
        
        int diff = hLen - nLen + 1;
        for (int i=0; i<diff; i++) {
            String subStr = haystack.substring(i, i+nLen);
            if (needle.equals(subStr)) {
                return i;
            }
        }
        
        return -1;
    }
}