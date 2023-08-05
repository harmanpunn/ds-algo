from collections import defaultdict
from functools import cache


def deleteAndEarn(nums):
    points = defaultdict(int)
    max_number = 0
    for num in nums:
        if num in nums:
            points[num] += 1
        else:
            points[num] = 1

    for num in points:
        points[num] *= num

    @cache
    def dp(i):
        if i == 0:
            return 0
        if i == 1:
            return points[1]
        
        # if i not in memo:
        #     memo[i] = max(dp(i-1), dp(i-2)+points[i])
        
        return max(dp(i-1), dp(i-2)+points[i])
    
    memo = {}
    return dp(min(nums)) 




nums = [2,2,3,3,3,4]
print(deleteAndEarn(nums))