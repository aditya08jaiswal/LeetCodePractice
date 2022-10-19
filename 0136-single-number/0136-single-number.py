class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        
        d = {}
        for i in range(0, len(nums)):
            if nums[i] in d:
                d[nums[i]] = d[nums[i]]+1
            else:
                d[nums[i]] = 1
        
        for key in d.keys():
            if d[key] == 1:
                return key