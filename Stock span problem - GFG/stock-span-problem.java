// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i=0; i<n; i++) {
            if (stack.empty()) {
                answer[i] = 1;
            } else if (!stack.empty() && price[stack.peek()] > price[i]) {
                answer[i] = i - stack.peek();
            } else if (!stack.empty() && price[stack.peek()] <= price[i]) {
                while (!stack.empty() && price[stack.peek()] <= price[i]) {
                    stack.pop();
                }
                if (stack.empty()) {
                    answer[i] = i + 1;
                } else {
                    answer[i] = i - stack.peek();
                }
            }
            
            stack.push(i);
        }
        
        return answer;
    }
    
}