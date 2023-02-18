def productExceptSelf(nums):
    left = [1]
    right = [1]
    ans = []

    for i in range(len(nums)):
        curr = left[-1]
        left.append(curr*nums[i])

    for i in range(len(nums)-1, 0, -1):
        curr = right[-1]
        right.append(curr*nums[i])

    for x,y in zip(left, reversed(right)):
        ans.append(x*y)
    return ans

nums = [-1,1,0,-3,3]
print(productExceptSelf(nums))


