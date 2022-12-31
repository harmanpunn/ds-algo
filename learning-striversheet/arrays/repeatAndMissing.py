'''
You are given a read-only array of N integers with values also in the range [1, N] both inclusive. 
Each integer appears exactly once except A which appears twice and B which is missing. 
The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.
'''

def findNumbers(nums):
    n = len(nums)
    out = [0]*2
    d_list = [0]*(n+1)
    for val in nums:
        d_list[val]+=1

        
    for i in range(1, len(d_list)):
        if d_list[i] > 1:
            out[0] = i
        if d_list[i] == 0:
            out[1] = i   
    
    return out

arr = [3,1,2,5,3]
print(findNumbers(arr))