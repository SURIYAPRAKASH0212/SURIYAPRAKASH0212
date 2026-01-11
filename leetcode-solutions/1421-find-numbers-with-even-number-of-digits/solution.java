class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10&&nums[i]<=99){
                count++;
            }
            else if(nums[i]>=1000&&nums[i]<=9999){
                count++;
            }
            else if(nums[i]>=100000&&nums[i]<=999999){
                count++;
            }
        }
        return count;
    }
}
