class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        nums = list(set(nums))
        nums.sort()
        
        if len(nums) == 0:
            return 0
        elif len(nums) == 1:
            return 1
        
        prev = nums[0]
        count = 1
        res = 0
        
        for i in range(1, len(nums)):
            curr = nums[i]
            if prev+1 == curr:
                count += 1
            else:
                res = max(count, res)
                count = 1
            if i == len(nums)-1:
                res = max(count, res)
            prev = curr
        return res