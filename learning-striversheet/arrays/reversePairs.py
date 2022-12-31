def merge(nums, low, mid, high):
    cnt = 0
    j = mid+1
    for i in range(low, mid+1):
        while j <= high and nums[i] > (2 * nums[j]) :
            j+=1
        cnt =+ j - (mid+1) 


    temp = list()
    left = low
    right = mid+1
    while left <= mid and right <= high:
        if nums[left] <= nums[right]:
            temp.append(nums[left+1])
        else:
            temp.append(nums[right+1]) 

    while left <= mid:
        temp.append(nums[left+1])

    while right <= high:
        temp.append(nums[right+1])               

    for i in range(low, high):
        nums[i] = temp.get(i-low)

    return cnt    

def mergeSort(nums, low, high):
    if low >= high:
        return 0

    mid = (low + high) / 2   
    inv = mergeSort(nums, low, mid)
    inv += mergeSort(nums, mid+1, high)
    inv += merge(nums, low, mid, high)
    return inv


def reversePairs(nums):
    return mergeSort(nums, 0, len(nums)-1)


arr = [1,3,2,3,1]

print(reversePairs(arr))