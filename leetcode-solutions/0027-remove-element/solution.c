int removeElement(int* nums, int n, int val) {
    int j=0;
    for(int i=0;i<n;i++){
        if(nums[i]!=val){
            nums[j]=nums[i];
            j++;
        }
    }
    return j;
}
