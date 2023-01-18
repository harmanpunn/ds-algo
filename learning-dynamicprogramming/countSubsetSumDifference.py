# Given an array Arr[] and a difference diff, find the number of subsets that array can be divided so that each the difference between the two subset is the given diff.


def subsetsum(sum, arr):
    n = len(arr)
    rows, cols = (len(arr)+1, sum+1)
    t = ([[0 for i in range(sum + 1)]
            for i in range(n + 1)])

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


def getCount(diff, arr):
    s1 = (diff + sum(arr))/2

    print(s1)
    return subsetsum(int(s1), arr)

arr = [1,1,1,1,1]
diff = 3
print(getCount(diff, arr))   

