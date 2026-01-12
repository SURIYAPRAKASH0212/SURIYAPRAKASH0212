class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0,count=0;;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        while(sum%k!=0){
            sum--;
            count++;
        }
        return count;
    }
}
