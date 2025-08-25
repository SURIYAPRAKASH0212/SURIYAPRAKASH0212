bool rotateString(char* s, char* goal) {
    int l=strlen(s);
    int t;
    for(int i=0;i<l;i++){
        t=s[0];
        for(int j=0;j<l-1;j++){
            s[j]=s[j+1];
        }
        s[l-1]=t;
        printf("%s\n",s);
        if(strcmp(s,goal)==0){
            return true;
        }
    }
    return false;
}
