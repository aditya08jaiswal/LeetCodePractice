class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        
        prev_sum = nums[0]
        
        for i in range(1, len(nums)):
            nums[i] = prev_sum + nums[i]
            prev_sum = nums[i]
        
        return nums