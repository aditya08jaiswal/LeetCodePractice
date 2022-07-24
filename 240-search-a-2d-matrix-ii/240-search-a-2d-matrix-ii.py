class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        mat = [each for row in matrix for each in row]
        if target in mat:
            return True
        return False