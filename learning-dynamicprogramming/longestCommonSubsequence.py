
# Recursive Implementation
def lcs(x, y, m, n):
    if m == 0 or n == 0:
        return 0

    if x[m-1] == y[n-1]:
        return 1 + lcs(x,y,m-1, n-1)
    else:
        return max(lcs(x,y,m-1, n), lcs(x,y,m,n-1))

# a = 'abcdgh'
# b = 'abedfhr'
# print(lcs(a,b, len(a), len(b)))

# Memoization Implementation
t = ([[-1 for i in range(1001)]
            for i in range(1001)])
             
def lcs_memo(x, y, m, n):
    if m == 0 or n == 0:
        return 0

    if t[m][n] != -1:
        return t[m][n]


    if x[m-1] == y[n-1]:
        t[m][n] = 1 + lcs(x,y,m-1, n-1)
        return 1 + lcs(x,y,m-1, n-1)
    else:
        t[m][n] = max(lcs(x,y,m-1, n), lcs(x,y,m,n-1))  
        return  max(lcs(x,y,m-1, n), lcs(x,y,m,n-1))  
         
a = 'abc'
b = 'def'
# print(lcs_memo(a,b, len(a), len(b)))
# lcs_memo


# Top down Implementation
text1 = "abcde"
text2 = "ace" 

def reverse(s):
    return s[::-1]

def lcs_topdown(text1, text2):
    seq = list()
    rows, cols = (len(text1)+1, len(text2)+1)
    dp = [[0 for i in range(cols)] for i in range(rows)]

    for i in range(1,rows):
        for j in range(1,cols):
            if text1[i-1] == text2[j-1]:
                dp[i][j] = 1 + dp[i-1][j-1]
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])


    m, n = rows-1, cols-1
    while m > 0 and n > 0:
        if text1[m-1] == text2[n-1]:
            seq.append(text1[m-1])
            m-=1
            n-=1
        else:
            if dp[m-1][n-1] > dp[m-1][n]:
                n-=1
            else:
                m-=1         
   
    return dp[rows-1][cols-1], reverse(seq)

print(lcs_topdown(text1,text2))    