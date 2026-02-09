class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int min=Integer.MAX_VALUE;
            int x=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min=nums[i];
                    x=i;
                }
            }
            nums[x]=nums[x]*multiplier;
            k--;
        }
        return nums;
    }
}
