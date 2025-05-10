int findPeakElement(int* nums, int numsSize) {
    int max=nums[0],i,a;
    for(i=0;i<numsSize;i++){
        if(nums[i]>max){
            max=nums[i];
            a=i;
        }
    }
    return a;
}
