class Solution(object):
    def findTheDifference(self, s, t):
        tSum = sum(ord(c) for c in t)
        sSum = sum(ord(c) for c in s)

        return chr(tSum - sSum)
