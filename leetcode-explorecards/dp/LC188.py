# 188. Best Time to Buy and Sell Stock IV
from functools import lru_cache
def maxProfit(k, prices):
    
    @lru_cache(None)
    def dp(i, tR, h):
        if tR == 0 or i == len(prices):
            return 0
        
        skip = dp(i+1, tR, h)
        buyOrSell = 0    
        if h == 1:
            buyOrSell = prices[i] + dp(i+1, tR-1, 0)
        else:
            buyOrSell = - prices[i] + dp(i+1, tR, 1)


        return max(skip, buyOrSell)
    
    return dp(0, k, 0)


k = 2
prices = [3,2,6,5,0,3]
print(maxProfit(k, prices))


