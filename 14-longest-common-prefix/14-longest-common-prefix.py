class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        elif len(strs) == 1:
            return strs[0]

        common = strs[0]
        for i in range(1, len(strs)):
            j = 0
            word = strs[i]
            res = ""
            m = min(len(common), len(word))
            if j == m:
                common = res
            while j < m:
                if word[j] == common[j]:
                    res = res + word[j]
                    j+=1
                    if j == m:
                        common = res
                else:
                    common = res
                    break
        

        return common