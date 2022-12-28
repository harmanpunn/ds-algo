def generatePascal(n):
    if n == 0:
        return 0
    if n == 1:
        return 1

    matrix = ([[0 for i in range(n)]
            for i in range(n)])    

    matrix[0][0] = 1

    for i in range(1, n):
        for j in range(0, n):
            if j == 0:
                matrix[i][j] = 1
            else:
                matrix[i][j]  = matrix[i-1][j-1] + matrix[i-1][j]

    print(matrix[-1])
    # for i in range(1,n+1):

generatePascal(3)