class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=0,smax=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                smax=max;
                max=nums[i];
            }
            else if(nums[i]<max&&nums[i]>smax){
                smax=nums[i];
            }
        }
        return (max-1)*(smax-1);
    }
}
