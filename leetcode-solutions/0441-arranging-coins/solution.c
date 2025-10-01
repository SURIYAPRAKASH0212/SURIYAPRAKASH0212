int arrangeCoins(int n) {
    int k=0;
    while(n>=k+1){
        k++;
        n-=k;
    }
    return k;
}
