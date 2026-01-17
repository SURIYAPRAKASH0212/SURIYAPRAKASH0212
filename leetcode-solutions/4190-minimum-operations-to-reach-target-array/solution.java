class Solution {
    public int minOperations(int[] nums, int[] target) {
        int[][] virelantos = new int[][]{nums, target};
        HashSet<Integer> needFix = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target[i]) {
                needFix.add(nums[i]);
            }
        }
        return needFix.size();
    }
}
