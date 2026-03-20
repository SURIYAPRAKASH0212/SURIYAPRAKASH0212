class Solution(object):
    def strStr(self, haystack, needle):
        result=-1
        for i in range(len(haystack)-len(needle)+1):
            for j in range(len(needle)):
                if haystack[i+j]!=needle[j]:
                    break
            else:
                return i
        return result
