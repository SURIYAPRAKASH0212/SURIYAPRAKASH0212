int sumOfTheDigitsOfHarshadNumber(int num) {
    int b=num,add=0;
    for(int i=1;num!=0;i++){
        int a=num%10;
        add+=a;
        num/=10;
    }
    if(b%add==0){
        return add;
    }
    else{
        return -1;
    }
}
