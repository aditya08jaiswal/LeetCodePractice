class Solution {
    
    private int add(int a, int b) {
        return a+b;
    }
    
    private int subtract(int a, int b) {
        return a-b;
    }
    
    private int multiply(int a, int b) {
        return a*b;
    }
    
    private int divide(int a, int b) {
        return a/b;
    }
    
    private int operate(int a, int b, String s) {
        if (s.equals("+")) {
            return add(a,b);
        } else if (s.equals("-")) {
            return subtract(a,b);
        } else if (s.equals("*")) {
            return multiply(a,b);
        } else if (s.equals("/")) {
            return divide(a,b);
        }
        return 0;
    }
    
    private boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return true;
        }
        return false;
    }
    
    public int evalRPN(String[] tokens) {
        
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        
        int total = 0;
        Stack<Integer> s = new Stack<>();
        
        for (int i=0; i<tokens.length; i++) {
            
            if (isOperator(tokens[i])) {
                int b = s.pop();
                int a = s.pop();
                total = operate(a, b, tokens[i]);
                s.push(total);
            } else {
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return total;
    }
}