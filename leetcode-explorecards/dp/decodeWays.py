from functools import lru_cache

def numDecodings(s):
    
    @lru_cache(None)
    def dp(i):
        if i == len(s):
            return 1 
        
        if s[i] == '0':
            return 0
        
        ans = dp(i+1)
        if (i+1 < len(s) and (s[i] == '1' or s[i] == '2' and s[i+1] in "0123456")):
            ans += dp(i+2)

        return ans

    return dp(0)



s = '06'
print(numDecodings(s))



    