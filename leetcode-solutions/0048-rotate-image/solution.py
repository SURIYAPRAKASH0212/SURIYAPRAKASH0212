class Solution(object):
    def rotate(self, matrix):
        row=len(matrix)
        col=len(matrix[0])
        for i in range(row):
            for j in range(i+1,col):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        for k in range(row):
            matrix[k].reverse()
