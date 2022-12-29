# Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

def rotate(matrix):
    res_mat = matrix
    # Matrix transpose
    for i in range(len(matrix)):
        for j in range(i+1, len(matrix[0])):
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]


    for i in range(len(matrix)):
        matrix[i].reverse()

    return matrix

matrix = [[1,2,3], [4,5,6], [7,8,9]] 
print(rotate(matrix))  