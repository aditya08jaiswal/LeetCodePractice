class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:

        intervals = sorted(intervals, key=lambda x:x[0])

        i = 1
        prev = 0
        while i<len(intervals):
            # [[1,3],[2,6]]
            if intervals[prev][1] >= intervals[i][0]:
                intervals[prev][0] = min(intervals[i][0], intervals[prev][0])
                intervals[prev][1] = max(intervals[i][1], intervals[prev][1])
                intervals.pop(i)
                continue
            prev = i
            i+=1
        return intervals