class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        res = []
        for each in nums1:
            if each in nums2 and each not in res:
                res.append(each)
        return res