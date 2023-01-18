# Unbounded knapsack

def unboundedKnapsack(N, length, price):
    n = len(price)
    rows, cols =  (n+1, N+1)

    t = [[0]*cols]*rows

    for i in range(rows):
        for j in range(cols):
            if i == 0 or j == 0:
                t[i][j] = 0


    for i in range(1, rows):
        for j in range(1, cols):
            if length[i-1] <= j:
                t[i][j] = max(price[i-1] + t[i][j-length[i-1]], t[i-1][j])   
            else:
                t[i][j] = t[i-1][j]  


    return t[n][N]

N = 8
length = [1,2,3,4,5,6,7,8]
price = [1, 5, 8, 9, 10, 17, 17, 20]

print(unboundedKnapsack(N, length, price))

