int singleNumber(int* nums, int n) {
    int c;
    for(int i=0;i<n;i++)
    {
        c=0;
        for(int j=0;j<n;j++)
        {
            if(nums[i]==nums[j]&&i!=j)
            {
                c=1;
                break;
            }
        }
        if(c==0)
        {
            
            return nums[i];
        }
   }
   return 0;
    
}
