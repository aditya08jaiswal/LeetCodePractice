class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        
        intervals = sorted(intervals, key=lambda x:x[0])
        print(intervals)
    
        res = []
        s = intervals[::-1]
        
        while s:
            if not res:
                res.append(s.pop())
                continue
        
            res_top = res[len(res)-1]
            s_top = s[len(s)-1]
            
            # [[1,4],[5,6]]
            if res_top[1] < s_top[0]:
                res.append(s.pop())
                continue
            # [[1,4],[0,2]]
            elif res_top[1] >= s_top[1] or res_top[1] >= s_top[0]:
                res[len(res)-1][0] = min(s_top[0], res_top[0])
                res[len(res)-1][1] = max(s_top[1], res_top[1])
                s.pop()
            # [[1,4],[3,6]]
            # elif res_top[1] >= s_top[0]:
            #     res[len(res)-1][1] = s_top[1]
            #     s.pop()
            
        return res