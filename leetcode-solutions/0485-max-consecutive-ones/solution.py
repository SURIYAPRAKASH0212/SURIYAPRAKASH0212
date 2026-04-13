class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        res = 0
        cur = 0
        for n in nums:
            if n:
                cur += 1
                if cur > res:
                    res = cur
            else:
                cur = 0
        return res
