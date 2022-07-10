class Solution {
    private boolean isOpening(char c) {
        return c == '(' || c ==  '{' || c ==  '[';
    }
    
    private boolean isMatching(char open, char close) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        if (map.get(open) == close) {
            return true;
        } 
        return false;
    }
    public boolean isValid(String s) {
        
        if (s.length() % 2 == 1) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if (!stack.isEmpty() && isOpening(s.charAt(i))) {
                stack.push(s.charAt(i));
                continue;
            }
            if (isOpening(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            else if (!stack.isEmpty() && isMatching(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                return false;
            }
        }
    
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}