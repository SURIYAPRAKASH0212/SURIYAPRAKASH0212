int ispall(int i,int j,char str[]){
    while(i<=j){
        if(str[i]!=str[j]){
            return 0;
        }
        i++;
        j--;
    }
    return 1;
    }
char* longestPalindrome(char* str) {
   static char str1[10000]={0};
    int len=strlen(str);
    int max=0,start,k=0;
    for(int i=0;i<len;i++){
        for(int j=i;j<len;j++){
            if(ispall(i,j,str)==1){
                int c=j-i+1;
                if(c>max){
                    max=c;
                    start=i;
                }
            }
        }
    }
    for(int i=start;i<start+max;i++){
        str1[k++]=str[i];
    }
    str1[k]='\0';
    return str1;
}
