def containsDuplicate(nums):
    hashmap = {}
    for i in range(len(nums)):
        if nums[i] in hashmap:
            return True
        hashmap[nums[i]] = i
    return False    


nums = [1,2,3,1]
print(containsDuplicate(nums))