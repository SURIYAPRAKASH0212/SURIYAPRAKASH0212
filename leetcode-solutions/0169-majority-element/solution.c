int majorityElement(int* nums, int n) {
    int maj=nums[0],count=1;
    for(int i=1;i<n;i++){
        if(count==0){
            maj=nums[i];
            count=1;
        }
        else if(maj==nums[i]){
            count++;
        }
        else{
            count--;
        }
    }
    return maj;
}
