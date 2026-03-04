class Solution(object):
    def numSpecial(self, mat):
        def check_row(row):
            if row.count(1) == 1:
                return True 
            return False
        
        def check_col(mat,j):
            count = 0
            for row in range(len(mat)):
                if mat[row][j] == 1:
                    count +=1
            if count == 1:
                 return True 
            else:
                return  False
        c=0
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                if mat[i][j] == 1:
                    if check_row(mat[i]) and check_col(mat,j):
                        c+=1
        return c
