class Solution:
    def digitSum(self, x: int) -> int:
        s = 0
        while x > 0:
            s += x % 10
            x //= 10
        return s

    def smallestIndex(self, nums: List[int]) -> int:
        for i, num in enumerate(nums):
            if self.digitSum(num) == i:
                return i
        return -1
