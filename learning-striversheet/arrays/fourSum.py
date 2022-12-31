def fourSum(nums, target):
    res = []
    n = len(nums)
    nums.sort()

    if len(nums) == 0:
        return res
    
    for i in range(n):
        t3 = target - nums[i]   
        for j in range(i+1, n):
            t2 = t3 - nums[j]
            front = j+1
            back = n-1

            while front < back:
                twoSum = nums[front] + nums[back]

                if twoSum < t2:
                    front+=1

                elif twoSum > t2:
                    back-=1

                else:
                    quad = []
                    quad.append(nums[i])
                    quad.append(nums[j])
                    quad.append(nums[front])
                    quad.append(nums[back])
                    res.append(quad)

                    while front < back and nums[front] == quad[2]:
                        front+=1

                    while front < back and nums[back] == quad[3]:
                        back-=1    

            while j+1 < n and nums[j+1] == nums[j]:
                j+=1

        while i+1 < n and nums[i+1] == nums[i]:
            i+=1
    return res





arr = [4,3,3,4,4,2,1,2,1,1]
target = 9 
print(fourSum(arr, target))

