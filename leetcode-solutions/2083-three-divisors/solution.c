bool isThree(int n) {
    int count=0;
    if(n==2){
        return false;
    }
    if(n%2==0&&n!=2){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
    }
    else if(n%2!=0){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
    }
    if(count==3){
        return true;
    }
    else if(count<3||count>3){
        return false;
    }
    else{
        return false;
    }
}
