class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        left, row, col = len(matrix), 0, len(matrix[0]) - 1
        while row < left and col >= 0:
            if matrix[row][col] == target:
                return True;
            elif matrix[row][col] < target:
                row+=1
            else:
                col-=1
        return False;

         


        