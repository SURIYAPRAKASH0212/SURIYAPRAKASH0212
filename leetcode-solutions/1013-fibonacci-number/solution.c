int c(int n){
    if(n==0){
        return 0;
    }
    if(n<0){
        return 1;
    }
    return c(n-1)+c(n-2);
}
int fib(int n){
    int x=c(n);
    return x;
}
