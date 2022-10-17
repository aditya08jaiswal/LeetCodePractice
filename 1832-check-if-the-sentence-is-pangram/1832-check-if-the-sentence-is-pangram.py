class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        
        if len(sentence) < 26:
            return False
        
        ahplabets = set()
        
        for char in sentence:
            ahplabets.add(char)
            
        if len(ahplabets) == 26:
            return True
        return False
            
        