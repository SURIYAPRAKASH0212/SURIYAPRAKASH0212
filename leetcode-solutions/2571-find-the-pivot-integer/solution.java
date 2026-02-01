class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int sum=0;
        for(int i=1;i<n+1;i++){
            sum+=i;
        }
        int currSum=0;
        for(int i=1;i<n+1;i++){
            currSum+=i;
            if(currSum==((sum+i)-currSum)){
                return i;
            }
        }
        return -1;
    }
}
