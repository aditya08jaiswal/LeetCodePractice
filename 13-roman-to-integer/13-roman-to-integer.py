class Solution:
    def romanToInt(self, s: str) -> int:
        
        numbers = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        
        add = 0
        i = 0
        
        while i < len(s):
            if i+1 < len(s) and numbers[s[i]] < numbers[s[i+1]]:
                add = add + numbers[s[i+1]] - numbers[s[i]]
                i += 2
            else:
                add = add + numbers[s[i]]
                i += 1
    
        return add
            