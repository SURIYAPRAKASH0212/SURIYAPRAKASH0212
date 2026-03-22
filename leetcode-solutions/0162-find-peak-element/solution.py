class Solution(object):
    def findPeakElement(self, nums):
        max=nums[0]
        max1=0
        for i in range(1,len(nums)):
            if nums[i]>max:
                max=nums[i]
                max1=i
        return max1
