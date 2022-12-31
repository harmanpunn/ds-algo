import math
def majorityElement(nums):
    ans = []
    freq = {}
    nums_len = len(nums)
    n = math.floor(nums_len/3)

    for v in nums:
        if v not in freq:
            freq[v] = 1
        else:
            freq[v] += 1 

        if freq[v] > n and v not in ans:
                ans.append(v)    

    return ans





nums = [2,2]
print(majorityElement(nums))