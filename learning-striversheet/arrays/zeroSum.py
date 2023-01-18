# Given an array containing both positive and negative integers, we have to find the length of the longest subarray with 
# the sum of all elements equal to zero.

def longestSubarray(nums):
    n=len(nums)
    max_len = 0
    sum = 0
    prefixSum = {}
    for i in range(n):
        sum+=nums[i]

        if sum == 0:
            max_len = i+1
        else:
            if sum in prefixSum:
                max_len = max(max_len, i-prefixSum[sum])   
            else:
                prefixSum[sum] = i
    return max_len



nums  = [1, 3, -5, 6, -2] 

print(longestSubarray(nums))