def scs(text1, text2):
    rows, cols = (len(text1)+1, len(text2)+1)
    dp = [[0 for i in range(cols)] for i in range(rows)]

    for i in range(1,rows):
        for j in range(1,cols):
            if text1[i-1] == text2[j-1]:
                dp[i][j] = 1 + dp[i-1][j-1]
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])


    lcs = dp[rows-1][cols-1]
    return len(text1) + len(text2) - lcs           


text1 = 'abac'
text2 = 'cab'

print(scs(text1,text2))