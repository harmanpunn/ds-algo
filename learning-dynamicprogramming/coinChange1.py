'''
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, 
how many ways can we make the change? The order of coins doesn’t matter.
Example:
for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.
'''

def numOfWays(sum, coins):
    n = len(coins)
    rows, cols = (n+1, sum+1)
    t = ([[0 for i in range(cols)] for i in range(rows)])

    for i in range(rows):
        for j in range(cols):
            if i == 0:
                t[i][j] = 0
            if j == 0:
                t[i][j] = 1


    for i in range(1, rows):
        for j in range(0, cols):
            if coins[i-1] <=j:
                t[i][j] = t[i][j-coins[i-1]] + t[i-1][j]       
            else:
                t[i][j] = t[i-1][j]

    return t[n][sum]                   

sum = 3
coins = [2]    
print(numOfWays(sum, coins))
