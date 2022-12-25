def subsetsum(arr, sum):
    t = ([[False for i in range(sum + 1)]
            for i in range(len(arr) + 1)])

    for i in range(len(arr)+1):
        for j in range(sum+1):
            if i == 0:
                t[i][j] = False
            if j == 0:
                t[i][j] = True    

    for i in range(1, len(arr)+1):
        for j in range(1, sum+1):
            if arr[i-1] <= j:
                t[i][j] = t[i-1][j-arr[i-1]] or t[i-1][j]
            else:
                t[i][j] = t[i-1][j]
    return t[len(arr)][sum]   


def equalsumpartition(arr):
    val = sum(arr)
    if val%2 != 0:
        return False
    else:
        return subsetsum(arr, int(val/2))    

arr = [3,5,11,5]                     

print(equalsumpartition(arr))