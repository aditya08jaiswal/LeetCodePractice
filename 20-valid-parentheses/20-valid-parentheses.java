class Solution {
    private boolean isOpening(char c) {
        return c == '(' || c ==  '{' || c ==  '[';
    }
    
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
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