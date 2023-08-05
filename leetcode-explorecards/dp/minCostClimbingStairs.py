def minCostClimbingStairs(cost):
    def dp(i):

        if i <= 1:
            return 0
        
        if i not in memo:
            memo[i] = min(cost[i-1]+dp(i-1), cost[i-2]+dp(i-2))
        return memo[i]
    
    memo = {}
    return dp(len(cost))


cost = [1,100,1,1,1,100,1,1,100,1]
print(minCostClimbingStairs(cost))