def maximalSquare(matrix):
    rows, cols = len(matrix),len(matrix[0])
    memo = {}

    def dp(i,j):
        if i >= rows or j >= cols:
            return 0
        
        if (i,j) not in memo:
            down = dp(i+1, j)
            right = dp(i, j+1)
            diag = dp(i+1, j+1)

            memo[(i,j)] = 0
            if matrix[i][j] == '1':
                memo[(i,j)] = min(down, right, diag) + 1

        return memo[(i,j)]
        
     
    dp(0,0)
    
    return max(memo.values()) ** 2
    



matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
print(maximalSquare(matrix))
    

