def findMin(nums) -> int:
        n = len(nums)
        l = 0
        r = n-1 
        if n == 1:
            return nums[0]
        
        if nums[r] > nums[0]:
            return nums[0]

        while l <= r:
            mid = l + (r-l) // 2
            if nums[mid] > nums[mid+1]:
                return nums[mid+1]
            if nums[mid-1] > nums[mid]:
                return nums[mid]

            if nums[mid] > nums[0]:
                l = mid + 1
            if nums[mid] < nums[0]:
                r = mid - 1 

        return None

nums = [4,5,6,7,0,1,2]
print(findMin(nums))