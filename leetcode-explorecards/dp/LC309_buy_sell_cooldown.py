from functools import lru_cache
def maxProfit(prices):

    @lru_cache(None)
    def dp(i,c,h):
        if i == len(prices):
            return 0
        
        skip = dp(i+1, c, h)

        buyOrSell = 0
        if h == 0:
            if c == 0:
                buyOrSell = - prices[i] + dp(i+1, c, 1)
            else:
                buyOrSell = dp(i+1, 1, 0)
        else:
            buyOrSell = prices[i] + dp(i+1, 1, 0)

        return max(skip, buyOrSell)
    
    return dp(0,0,0)
            

    