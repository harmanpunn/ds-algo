


def findDuplicate(arr):
    freq = {}
    for v in arr:
        if v not in freq:
            freq[v] = 1
        else:
            freq[v]+=1    

    for key, value in freq.items():
        if value > 1:
            return key    
        
    
   
    
arr=[1,3,4,2,2]
print(findDuplicate(arr))