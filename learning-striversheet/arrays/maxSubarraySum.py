import sys

def maxSubarraySum(a):
    ans = -sys.maxsize - 1
    idx=[]
    l_max = 0
    s = 0
    for i in range(len(a)):
        l_max = max(a[i] , a[i] + l_max )
        if l_max > ans:
            idx.clear()
            ans = l_max
            idx.append(i)
            idx.append(s)
        if l_max < 0:
            l_max = 0
            s = i+1    

    return ans, idx


arr = [-2,1,-3,4,-1,2,1,-5,4] 


print(maxSubarraySum(arr))