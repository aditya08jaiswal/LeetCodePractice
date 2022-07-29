class Solution:
    
    def map_word(self, word):
        _map = {}
        for i, char in enumerate(word):
            if char in _map:
                _map[char].append(i)
            else:
                _map[char] = [i]
        return list(_map.values())

    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        
        pattern_list = self.map_word(pattern)
        
        match = []
        for word in words:
            temp = self.map_word(word)
            if temp == pattern_list:
                match.append(word)
        return match