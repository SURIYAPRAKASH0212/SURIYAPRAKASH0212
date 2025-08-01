int smallestEvenMultiple(int n) {
    int i=0;
    while(n>0){
        if(n%2==0){
            return n;
        }
        else{
            return n*2;
        }
    }
    return 0;
}
