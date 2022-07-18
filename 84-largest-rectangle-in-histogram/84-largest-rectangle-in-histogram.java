class Solution {
    
    private int[] findNSL(int[] heights, int len) {
        Stack<Integer> s = new Stack<Integer>();
        int[] nsl = new int[len];
        
        for (int i=0; i<len; i++) {
            
            if (s.empty()) {
                nsl[i] = 1;
            } else if (!s.empty() && heights[s.peek()] < heights[i]) {
                nsl[i] = i-s.peek();
            } else if (!s.empty() && heights[s.peek()] >= heights[i]) {
                while(!s.empty() && heights[s.peek()] >= heights[i]) {
                    s.pop();
                }
                if (s.empty()) {
                    nsl[i] = i+1;
                } else {
                    nsl[i] = i-s.peek();
                }
            }
            
            s.push(i);
        }
        
        return nsl;
    }
    
    private int[] findNSR(int[] heights, int len) {
        Stack<Integer> s = new Stack<Integer>();
        int[] nsr = new int[len];
        
        for (int i=len-1; i>=0; i--) {
            
            if (s.empty()) {
                nsr[i] = -1;
            } else if (!s.empty() && heights[s.peek()] < heights[i]) {
                nsr[i] = s.peek();
            } else if (!s.empty() && heights[s.peek()] >= heights[i]) {
                while(!s.empty() && heights[s.peek()] >= heights[i]) {
                    s.pop();
                }
                if (s.empty()) {
                    nsr[i] = -1;
                } else {
                    nsr[i] = s.peek();
                }
            }
            
            s.push(i);
        }
        
        for (int i=0; i<len; i++) {
            if (nsr[i] < 0) {
                nsr[i] = len - i;
            } else {
                nsr[i] = nsr[i] - i;
            }
        }
        
        return nsr;
    }
    
    private int[] findWidth(int[] nsl, int[] nsr) {
        
        for (int i=0; i<nsl.length; i++) {
            nsl[i] = nsl[i] + nsr[i] - 1;
        }
        return nsl;
    }
    
    private int[] findHeight(int[] width, int[] heights) {
        
        for (int i=0; i<width.length; i++) {
            width[i] = width[i] * heights[i];
        }
        return width;
    }
    
     private int findMax(int[] width) {
        int max = width[0];
        for (int i=1; i<width.length; i++) {
            if (max < width[i]) {
                max = width[i];
            }
        }
        return max;
    }
    
    public int largestRectangleArea(int[] heights) {
        
        int len = heights.length;
        
        int[] nsl = findNSL(heights, len);
        int[] nsr = findNSR(heights, len);
        
        int[] width = findWidth(nsl, nsr);
        
        int[] height = findHeight(width, heights);
        
        int max = findMax(height);
        
        return max;
    }
}