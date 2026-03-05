class Solution(object):
    def subsets(self, nums):
        window = 1
        l = [[]]
        while window != len(nums) + 1:
            for combo in combinations(nums, window):
                l.append(list(combo))
            window += 1
        return l
