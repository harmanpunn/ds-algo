def longestConsecutive(nums):
    hashSet = set(nums)
    longest = 0
    for n in nums:
        if n-1 not in hashSet:
            curr = n
            currSeqLen = 1

            while curr + 1 in hashSet:
                curr += 1
                currSeqLen += 1

            longest = max(currSeqLen, longest)

    return longest

nums = [0]
print(longestConsecutive(nums))                
