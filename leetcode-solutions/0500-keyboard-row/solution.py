class Solution(object):
    def findWords(self, words):
        result=[]
        l1='qwertyuiopQWERTYUIOP'
        l2='asdfghjklASDFGHJKL'
        l3='zxcvbnmZXCVBNM'
        for i in words:
            f=0
            for j in i:
                if j in l1:
                  if f==0:
                    f=1
                  if f!=1:
                    f=-1
                    break
                elif j in l2:
                  if f==0:
                    f=2
                  if f!=2:
                    f=-1
                    break
                elif j in l3:
                  if f==0:  
                    f=3
                  if f!=3:
                    f=-1
                    break
            if f!=-1:
                result.append(i)
        return result
