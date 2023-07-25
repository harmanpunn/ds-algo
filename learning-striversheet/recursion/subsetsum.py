def subsetSumHelper(i, sum, arr, N, ans):
    if i == N:
        ans.append(sum)
        return

    # Pick element
    subsetSumHelper(i+1, sum+arr[i], arr, N, ans)
    # Do not pick element
    subsetSumHelper(i+1, sum, arr, N, ans)

def subsetSum(arr):
    ans = []
    subsetSumHelper(0, 0, arr, len(arr), ans)
    return sorted(ans)

arr = [5,2,1]
print('Answer:', subsetSum(arr))