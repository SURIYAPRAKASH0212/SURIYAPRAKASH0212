bool detectCapitalUse(char* str) {
    int count=0,add=0,sum=0;
    for(int i=0;str[i]!='\0';i++){
        if(str[i]>='a'&&str[i]<='z'){
            count++;
        }
        else if(str[i]>='A'&&str[i]<='Z'){
            add++;
        }
    }
    if(strlen(str)==count||strlen(str)==add||str[0]>='A'&&str[0]<='Z'&&add==1){
        return true;
    }
    else{
        return false;
    }
}
