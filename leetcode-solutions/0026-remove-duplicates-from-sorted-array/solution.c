int removeDuplicates(int* nums, int n){
    int c=1;
    for(int i=0;i<n;i++){
        if(nums[i]!=nums[c-1]){
            nums[c]=nums[i];
            c++;
        }
    }
    return c;
}
