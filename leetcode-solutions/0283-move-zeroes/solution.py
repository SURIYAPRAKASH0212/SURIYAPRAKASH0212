class Solution(object):
    def moveZeroes(self, nums):
        k=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[k]=nums[i]
                k+=1
        for j in range(k,len(nums)):
            nums[j]=0
