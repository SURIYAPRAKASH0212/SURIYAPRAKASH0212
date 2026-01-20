class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[k++]=nums[i];
            }
            else{
                ans[--n]=nums[i];
            }
        }
        return ans;
    }
}
