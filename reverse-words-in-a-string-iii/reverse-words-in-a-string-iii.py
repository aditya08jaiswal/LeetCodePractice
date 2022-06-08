class Solution:
    def reverseWords(self, s: str) -> str:
        
        tokens = s.split()
        
        for i, token in enumerate(tokens):
            tokens[i] = token[::-1]
            
        return " ".join(tokens)
                    
            
            