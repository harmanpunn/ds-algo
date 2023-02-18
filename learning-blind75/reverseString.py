def reverseString(st):
    s = list(st)
    l, r = 0, len(s) - 1

    while l<r:
        s[l], s[r] = s[r], s[l]
        l+=1
        r-=1

    return ''.join(s)    

s = 'harman'
print(reverseString(s))

# Time Complexity: O(N), Space: O(1)
