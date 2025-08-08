bool isPerfectSquare(int num) {
    int flag=0;
    for(int i=0;i<=sqrt(num);i++){
        if(i*i==num){
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
