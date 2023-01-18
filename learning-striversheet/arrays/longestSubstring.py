def longestSubstring(str):
    maxWindow = 0
    map = {}
    i=0
    j=0

    while j<len(str):
        ch = str[j]
        count = map.get(ch, 0)
        map[ch]=count+1

        if map[ch] == 1:
            maxWindow = max(maxWindow, j-i+1) 
            j+=1
        elif map[ch] > 1:
            
            while map[ch] > 1:
                rm = str[i]
                map[rm] = map[rm]-1
                if map[rm] == 0:
                    del map[rm]
                i+=1
            j+=1            
    return maxWindow



str = 'bbbbb'
print(longestSubstring(str))   


