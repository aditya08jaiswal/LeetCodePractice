class Solution {
    public String addBinary(String a, String b) {
        // int num1 = Integer.parseInt(a, 2);
        // int num2 = Integer.parseInt(b, 2);
        
        if (a.equals("0") && b.equals("0")) {
            return "0";
        }
        
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        
        int numA = 0;
        int numB = 0;
        
        int carry = 0;
        
        StringBuilder str = new StringBuilder();

        while (lenA >= -1 || lenB >= -1) {
            if (lenA >= 0) {
                numA = Integer.parseInt(String.valueOf(a.charAt(lenA)));
                
            } else {
                numA = 0;
            }
            lenA--;
            
            if (lenB >= 0) {
                numB = Integer.parseInt(String.valueOf(b.charAt(lenB)));
                
            } else {
                numB = 0;
            }
            lenB--;
            
            int sum = numA + numB + carry;
            
            if (sum == 3) {
                carry = 1;
            } else if (sum == 2) {
                carry = 1;
            } else if (sum == 1) {
                carry = 0;
            } else {
                carry = 0;
            }
            
            sum = sum%2;
            
            str.insert(0, sum);
        }
        
        int len = 0;
        
        while (str.length() > 0) {
            
            if (Integer.parseInt(String.valueOf(str.charAt(len))) == 1) {
                break;
            }
            
            str.deleteCharAt(len);
        }
        
        return str.toString();
    }
}