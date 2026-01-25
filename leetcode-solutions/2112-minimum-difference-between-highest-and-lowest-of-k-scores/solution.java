class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int l=0;
        int r=k-1;
        while(l<=nums.length-k){
            diff=Math.min(diff,nums[r]-nums[l]);
            l++;
            r++;
        }
        return diff;
    }
}
