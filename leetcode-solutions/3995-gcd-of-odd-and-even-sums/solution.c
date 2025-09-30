int gcdOfOddEvenSums(int n) {
    int oddsum=0,evensum=0;
    for(int i=1;i<=n*2;i++){
        if(i%2!=0){
            oddsum+=i;
        }
        else{
            evensum+=i;
        }
    }
    int gcd=evensum-oddsum;
    return gcd;
}
