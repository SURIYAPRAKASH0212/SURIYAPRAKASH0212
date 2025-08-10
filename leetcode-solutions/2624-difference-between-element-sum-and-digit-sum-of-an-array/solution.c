int differenceOfSum(int* nums, int n) {
    int sum=0,add=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
        int temp=nums[i];
        while(temp>0){
            add+=temp%10;
            temp/=10;
        }
    }
    int sub=sum-add;
    if(sub<0){
        sub=-sub;
    }
    return sub;
}
