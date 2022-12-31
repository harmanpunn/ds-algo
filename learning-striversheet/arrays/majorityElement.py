import math
def majorityElement(nums):
    n = len(nums)
    m = math.floor(n/2)
    freq = {}
    for v in nums:
        if v not in freq:
            freq[v] = 1
        else:
            freq[v] += 1 
            if freq[v] > m:
                return v

    return None


nums = [2,2,1,1,1,2,2]
print(majorityElement(nums))