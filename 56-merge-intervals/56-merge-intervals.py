class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        
        intervals = sorted(intervals, key=lambda x:x[0])
    
        res = [intervals[0]]
        
        i = 1
        while i<len(intervals):
            res_top = res[len(res)-1]
            curr = intervals[i]
            
            # [[1,4],[5,6]]
            if res_top[1] < curr[0]:
                res.append(intervals[i])
            else:
                # [[1,4],[0,2]] or [[1,4],[3,6]]
                res[len(res)-1][0] = min(curr[0], res_top[0])
                res[len(res)-1][1] = max(curr[1], res_top[1])
            i+=1
        return res