
from functools import lru_cache

def wordbreak(s, wordDict):
    dp = [False] * len(s)

    for i in range(len(s)):
        for word in wordDict:
            if i >= len(word) - 1 and (i == len(word) - 1 or dp[i - len(word)]):
                if s[i - len(word) + 1 : i+1] == word:
                    dp[i] = True

    
    return dp[-1]



def wordBreak(wordDict):
    @lru_cache(None)
    def dp(i):
        if i < 0: 
            return True
        for word in wordDict:
            if (i >= len(word) - 1) and dp(i - len(word)):
                if s[i - len(word) + 1 : i + 1] == word:
                    return True
        
        return False
    
    return dp(len(s) - 1)

 
        
s = "catsandog" 

wordDict = ["cats","dog","sand","and","cat"]

s = "applepenapple"
wordDict = ["apple","pen"]

print(wordbreak(s, wordDict))