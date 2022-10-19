class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        cs = ""
        
        for char in s:
            if char.isalnum():
                if char.isnumeric():
                    cs += char
                else:
                    cs += char.lower()
        print(cs)
        start = 0
        end = len(cs) - 1
        mid = int(len(cs)/2)
        if cs:
            for i in range(start, mid+1):
                if cs[i] != cs[end]:
                    return False

                end -= 1
        return True