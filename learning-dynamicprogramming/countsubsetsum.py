
def subsetsum(sum, arr):
    for i in range(rows):
        for j in range(cols):
            if i == 0:
                t[i][j] = 0
            if j == 0:
                t[i][j] = 1    

    for i in range(1,rows):
        for j in range(1,cols):
            if arr[i-1] <= j:
                t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j]
            else:
                t[i][j] = t[i-1][j]
    return t[len(arr)][sum]                 

sum = 20
arr = [2,3,5,6,8,10]
n = len(arr)
rows, cols = (len(arr)+1, sum+1)
t = ([[0 for i in range(sum + 1)]
            for i in range(n + 1)])

print(subsetsum(sum, arr))

