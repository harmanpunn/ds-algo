# 121. Best Time to Buy and Sell Stock
'''
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
'''

def maxProfit(prices):
    curr_max = 0
    curr_min  = float('inf')
    for i in range(len(prices)):
        if prices[i] > curr_min:
            curr_max = max(prices[i] - curr_min, curr_max)
        else:
            curr_min = prices[i]
    return curr_max


prices = [7,1,5,3,6,4]
print(maxProfit(prices))



