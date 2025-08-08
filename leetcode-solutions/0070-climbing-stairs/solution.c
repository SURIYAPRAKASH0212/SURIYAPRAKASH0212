int c(int n,int dp[]){
    if(n==0){
        return 1;
    }
    if(n<0){
        return 0;
    }
    if(dp[n]!=0){
        return dp[n];
    }
    dp[n]=c(n-1,dp)+c(n-2,dp);
    return dp[n];
}
int climbStairs(int n) {
   int dp[n+1];
   for(int i=0;i<n;i++){
    dp[i+1]=0;
   }
    int z=c(n,dp);
    return z;
}
