bool isPowerOfFour(int n) {
    int flag=0;
    for(int i=0;i<=sqrt(n)+1;i++){
        int a=pow(4,i);
        if(a==n){
            flag=1;
        }
    }
    if(flag==1){
        return true;
    }
    else{
        return false;
    }
}
