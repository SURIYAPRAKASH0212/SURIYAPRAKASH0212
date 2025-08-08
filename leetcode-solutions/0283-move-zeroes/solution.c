void moveZeroes(int* nums, int n) {
    int t;
    for(int i=0;i<n;i++){
        if(nums[i]==0){
            t=i;
            break;
        }
    }
    for(int i=t+1;i<n;i++){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[t];
            nums[t]=temp;
            t++;
        } 
    }
}
