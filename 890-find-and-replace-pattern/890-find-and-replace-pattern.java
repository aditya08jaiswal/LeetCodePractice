class Solution {
    
    private boolean matchString(String a, String b){
        for (int i=0; i<a.length(); i++) {
            if(a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> match = new ArrayList<String>();
        
        for (String word: words) {
            if (matchString(word, pattern)) match.add(word);
        }
        
        return match;
    }
}