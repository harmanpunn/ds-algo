def rob(nums):
    def dp(i):

        if i == 0:
            return nums[0]
        if i == 1:
            return max(nums[0], nums[1])
        
        if i not in memo:
            memo[i] = max(dp(i-1), dp(i-2)+nums[i])

        return memo[i]
    
    memo = {}
    return dp(len(nums) - 1)


def rob_bottom_up(nums):
    if len(nums) == 1:
        return nums[0]

    dp = [0] * len(nums)

    dp[0] = nums[0]
    dp[1] = max(nums[0], nums[1])

    for i in range(2, len(nums)):
        dp[i] = max(dp[i-1], dp[i-2]+nums[i])
    
    return dp[-1]

nums = [1,3,9,7,2]
print(rob(nums))
print(rob_bottom_up(nums))