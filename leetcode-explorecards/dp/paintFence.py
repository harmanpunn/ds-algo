from functools import lru_cache
def numWays(n, k):

    @lru_cache(None)
    def dp(i):
        if i == 0:
            return 0
        if i == 1: 
            return k
        if i == 2:
            return k*k
        
        return  (k-1) * (dp(i-1) + dp(i-2))


    memo = {}
    return dp(n)


n = 7
k = 2
print(numWays(n, k))