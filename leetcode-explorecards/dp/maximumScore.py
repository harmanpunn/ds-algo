from functools import lru_cache


def maximumScore(nums, multipliers):

    @lru_cache(2000)
    def dp(i, left):
        if i == m:
            return 0
        
        mult = multipliers[i]
        right = n - 1 - (i - left)

        return max(mult * nums[left] + dp(i+1, left+1), mult * nums[right] + dp(i+1, left))

    n, m = len(nums), len(multipliers)
    return dp(0,0)

nums = [-5,-3,-3,-2,7,1]
multipliers = [-10,-5,3,4,6]

print(maximumScore(nums, multipliers))