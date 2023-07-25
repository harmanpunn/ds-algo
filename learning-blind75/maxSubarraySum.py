def maxSubarraySum(nums):
    curr_max = 0
    ans = -99999
    for i in range(len(nums)):
        curr_max = max(nums[i], curr_max+nums[i])
        if curr_max > ans:
            ans = curr_max
    return ans

nums = [-2,1,-3,4,-1,2,1,-5,4]
print(maxSubarraySum(nums))