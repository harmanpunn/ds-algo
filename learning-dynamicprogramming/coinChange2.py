'''
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.
'''

def coinChange(coins, amount: int) -> int:
       
        n = len(coins)
        rows, cols = (n+1, amount+1)

        t = [[0 for i in range(cols)] for i in range(rows)]

        for j in range(cols):
            t[0][j] = 999999

        for j in range(1, cols):
            if j%coins[0] == 0:
                t[1][j] = j // coins[0]
            else:
                t[1][j] = -1

        for i in range(1, rows):
            for j in range(1,cols):
                if coins[i-1] <= j:
                    t[i][j] = min(t[i][j-coins[i-1]]+1,  t[i-1][j]) 
                else:
                    t[i][j] = t[i-1][j]  

        if t[n][amount] == 999999:
            return -1
        return t[n][amount]  



coins = [1,2,5]
amount = 11        

print(coinChange(coins, amount))