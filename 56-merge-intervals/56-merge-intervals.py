class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        
        intervals = sorted(intervals, key=lambda x:x[0])
    
        res = [intervals[0]]
        
        i = 1
        while i<len(intervals):
            # [[1,4],[5,6]]
            if res[len(res)-1][1] < intervals[i][0]:
                res.append(intervals[i])
            else:
                # [[1,4],[0,2]] or [[1,4],[3,6]]
                res[len(res)-1][0] = min(intervals[i][0], res[len(res)-1][0])
                res[len(res)-1][1] = max(intervals[i][1], res[len(res)-1][1])
            i+=1
        return res