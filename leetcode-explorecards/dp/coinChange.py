def coinChange(coins, amount):
    rows, cols = len(coins) + 1, amount + 1

    # t = [[0] * cols]*rows
    t = ([[0 for i in range(cols)]
            for i in range(rows)])

    for i in range(rows):
        for j in range(cols):
            if i == 0:
                t[i][j] = float('inf') - 1
            if j == 0:
                t[i][j] = 0
            if i == 1:
                if j % coins[0] == 0:
                    t[i][j] = j / coins[0]
                else:
                    t[i][j] = float('inf') - 1


    for i in range(2, rows):
        for j in range(1, cols):
            if coins[i-1] <= j:
                t[i][j] = min(1+t[i][j-coins[i-1]],  t[i-1][j])
            else:
                t[i][j] = t[i-1][j]
    
            
    return t[len(coins)][amount]

coins = [1,2,5]
amount = 5
print(coinChange(coins, amount))

