def twoSum(nums, target):
    n = len(nums)
    out = []
    for i in range(n):
        val = target - nums[i]
        if val in nums[i+1:]:
            out.append(i)
            nums.pop(i)
            out.append(nums.index(val)+1)     
            break  
            
    return out        
    

nums = [2,7,11,15]
target = 9
print(twoSum(nums, target))    