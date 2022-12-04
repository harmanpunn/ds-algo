wt = [1,3,4,5]        
val = [1,4,5,7]
W = 7
 
# For memoization
rows, cols = (6, 9)
t = [[-1]*cols]*rows

def knapsack(wt, val, W, n):
    if n==0 or W ==0:
        return 0
    
    # For memoization
    if(t[n][W] != -1):
        return t[n][W]    

    if wt[n-1] <= W: 
         t[n][W] = max(val[n-1] + knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1))
         return t[n][W]
    else:
        t[n][W] = knapsack(wt, val, W, n-1)
        return t[n][W]



print(knapsack(wt,val,W,len(val)))