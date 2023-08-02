def maxProduct(nums) -> int:
    curr_max = 1
    curr_min = 1
    ans = max(nums)

    for i in range(len(nums)):
        n = nums[i]
        if n == 0:
            curr_max = 1
            curr_min = 1
            continue
        
        tmp = n*curr_max
        curr_max = max(tmp, n*curr_min, n)
        curr_min = min(tmp, n*curr_min, n)

        ans = max(curr_max, ans)
    return ans

nums = [-2,3,-2,4]
print(maxProduct(nums))