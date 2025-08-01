bool isPalindrome(int x) {
    double b=x,sum=0;
    while(x>0){
        int a=x%10;
        sum=sum*10+a;
        x/=10;
    }
    if(sum==b){
        return true;
    }
    else{
        return false;
    }
}
