def search(matrix, num):
    i = 0
    for i in range(len(matrix)):
        if matrix[i][len(matrix[0])-1] >= num:
            break

    for m in range(len(matrix[i])):
        if  num == matrix[i][m]:
            return True       
    return False


matrix = [[1,3,5,7],  [10,11,16,20], [23,30,34,60]]
print(search(matrix, 8))