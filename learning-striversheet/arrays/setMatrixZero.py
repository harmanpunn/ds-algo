# Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

# Brute Force
def setMatrixZero(a):
    for i in range(len(a)):
        for j in range(len(a[0])):
            if a[i][j] == 0:
                a = updateMatrix(a,i,j)

    for i in range(len(a)):
        for j in range(len(a[0])):
            if a[i][j] == -1:
                a[i][j] = 0
    return a

def updateMatrix(a, i, j):
    for m in range(len(a)):
        for n in range(len(a[0])):
            if  (m == i or n == j) and a[m][n] != 0:
                a[m][n] = -1
    return a          


# Optimized approach that uses two mock arrays to reduce time complexity
def setZeroes(a):
    rows, cols = (len(a), len(a[0]))
    d1 = [-1]*rows
    d2 = [-1]*cols

    for i in range(rows):
        for j in range(cols):
            if a[i][j] == 0:
                d1[i] = 0
                d2[j] = 0
    for i in range(rows):
        for j in range(cols):
            if d1[i] == 0 or d2[j] == 0:
                a[i][j] = 0
    return a            



arr1 = [[1,1,1],[1,0,1], [1,1,1]]
arr2 = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
print(setZeroes(arr2))