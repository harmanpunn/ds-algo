def maxProfit(prices):
    curr_max = 0
    curr_min = 9999999
    for i in range(0, len(prices)):
        if prices[i] > curr_min:
            curr_max = max(prices[i] - curr_min, curr_max)
        else:
            curr_min = prices[i]
    return curr_max


prices1 = [7,1,5,3,6,4]
prices2 = [7,6,4,3,1]
print(maxProfit(prices2))
