int addDigits(int num) {
    int sum=0;
    if(num<0){
        num=-num;
    }
    if(num==0){
        num=0;
    }
        while(num>=10){
            sum=0;
            while(num>0){
                sum+=num%10;
                num=num/10;
        }
        num=sum;
    }
    return num;
}
