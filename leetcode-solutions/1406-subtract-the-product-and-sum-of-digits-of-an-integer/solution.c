int subtractProductAndSum(int n) {
    int s=0,p=1;
    while(n>0){
        s+=n%10;
        p*=n%10;
        n=n/10;
    }
    int ans=p-s;
    return ans;
}
