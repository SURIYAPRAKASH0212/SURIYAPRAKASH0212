

int countOdds(int low, int high){
    int a=0;
    for(int i=low;i<=high;i++){
        if(i%2!=0){
            a++;
        }
    }
    return a;
}
