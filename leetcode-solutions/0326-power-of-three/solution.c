bool isPowerOfThree(int n) {
    int flag=0;
    for(int i=0;i<sqrt(n);i++){
        int a=pow(3,i);
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
