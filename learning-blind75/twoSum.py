'''
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
'''

def twoSum(nums, target):
    hashmap = {}
    for i in range(len(nums)):
        val = target - nums[i]
        if val in hashmap:
            return (i, hashmap[val])
        hashmap[nums[i]] = i    


nums = [3,2,4]
target = 6

print(twoSum(nums, target))
