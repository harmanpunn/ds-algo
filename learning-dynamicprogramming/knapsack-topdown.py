wt = [1,3,4,5]        
val = [1,4,5,7]
W = 7

rows, cols = (5, 8)
t = [[0]*cols]*rows

def knapsack(wt, val, W, n):
    for i in range(0,n+1):
        for j in range(0,W+1):
            if i == 0 or j == 0:
                t[i][j] = 0  


    for i in range(1,n+1):
        for j in range(1,W+1): 
            if wt[i-1] <= j:
                t[i][j] = max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j])
            else:
                t[i][j] = t[i-1][j]    

    return t[n][W]


print(knapsack(wt,val,W,len(val)))