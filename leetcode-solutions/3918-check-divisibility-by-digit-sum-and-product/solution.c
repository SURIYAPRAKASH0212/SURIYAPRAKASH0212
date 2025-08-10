bool checkDivisibility(int num) {
    int original=num;
    int sum=0,product=1;
    for(int i=num;num!=0;i++){
        int a=num%10;
        sum+=a;
        product*=a;
        num/=10;
    }
    int b=sum+product;
    if(original%b==0){
        return true;
    }
    else{
        return false;
    }
}
