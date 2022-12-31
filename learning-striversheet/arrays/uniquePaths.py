

def uniquePaths(m,n):
    t = [[0]*n]*m
    for i in range(m):
        t[i][0] = 1

    for i in range(n):
        t[0][i] = 1    
        
    for i in range(1,m):
        for j in range(1,n):
            t[i][j] = t[i-1][j] + t[i][j-1]

    return t[m-1][n-1]        



m, n = (23, 12)
print(uniquePaths(m,n))
