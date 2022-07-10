class Solution:
    
    def isOpening(self, c):
        if c in "({[":
            return True
        return False
    
    def isMatch(self, a, b):
        d = {
            "(": ")",
            "{": "}",
            "[": "]"
        }
        
        if d[a] == b:
            return True
        return False
        
    def isValid(self, s: str) -> bool:
        
        if len(s)%2 == 1:
            return False
        
        stack = []
        
        for each in s:
            if len(stack) != 0 and self.isOpening(each):
                stack.append(each)
                continue
            if self.isOpening(each):
                stack.append(each)
            elif len(stack) > 0 and self.isMatch(stack[len(stack)-1], each):
                stack.pop()
            else:
                return False
        if stack:
            return False
        return True
            