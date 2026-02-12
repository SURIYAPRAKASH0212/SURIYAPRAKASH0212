class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=0;i<n;i++){
            arr[i+1]=nums[i]+arr[i];
        }
        for(int i=1;i<=n;i++){
            if(arr[n]-arr[i]==arr[i-1]){
                return i-1;
            }
        }
        return -1;
    }
}
