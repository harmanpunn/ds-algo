
def subsetsum(arr):
    for i in range(rows):
        for j in range(cols):
            if i == 0:
                t[i][j] = False
            if j == 0:
                t[i][j] = True    

    for i in range(1,rows):
        for j in range(1,cols):
            if arr[i-1] <= j:
                t[i][j] = t[i-1][j-arr[i-1]] or t[i-1][j]
            else:
                t[i][j] = t[i-1][j]
    # print(t)
    return t        

def minSubsetSumDifference(boolArr, arr):
    resList = []
    mn = 9999
    for i in range(cols):
        if boolArr[n][i]:
            resList.append(i)
    print(resList)        

    for i in range(len(resList)):
        if resList[i]:
            mn = min(mn, sum(arr) - 2*resList[i])

    for j in range(sum(arr) // 2, -1, -1):
        if t[n][j] == True:
            diff = sum(arr)  - (2 * j)
            break        

    return mn    

# sum = 11
arr = [1,2,7]
n = len(arr)
rows, cols = (n+1, sum(arr)+1)  
t = ([[False for i in range(sum(arr) + 1)]
            for i in range(n + 1)])

# boolArr = subsetsum(arr)
print(minSubsetSumDifference(subsetsum(arr), arr))

