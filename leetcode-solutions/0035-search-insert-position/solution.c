int searchInsert(int* nums, int n, int target) {
    for(int i=0;i<n;i++){
        if(nums[i]==target){
            return i;
        }
        else if(nums[i]>target){
            return i;
        }
    }
    return n;
}
