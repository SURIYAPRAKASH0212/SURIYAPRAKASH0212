int get(char num){
    switch(num){
        case 'I':
        return 1;
        case 'V':
        return 5;
        case 'X':
        return 10;
        case 'L':
        return 50;
        case 'C':
        return 100;
        case 'D':
        return 500;
        case 'M':
        return 1000;
    }
    return 0;
}
int romanToInt(char* s) {
    int sum=0;
    for(int i=0;s[i]!='\0';i++){
        int a=get(s[i]);
        int b=get(s[i+1]);
        if(a>=b){
            sum=sum+a;
        }
        else{
            sum=sum-a;
        }
    }
    return sum;
}
