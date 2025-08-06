bool isAnagram(char* s, char* t) {
    int freq1[256]={0},freq2[256]={0};
    int flag=0;
    for(int i=0;s[i]!='\0';i++){
        if((s[i]>='a'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z')) {
			freq1[s[i]]++;
		}
    }
    for(int i=0;t[i]!='\0';i++){
        if((t[i]>='a'&&t[i]<='z')||(t[i]>='A'&&t[i]<='Z')) {
			freq2[t[i]]++;
		}
    }
    for(int i=0;i<256;i++){
        if(freq1[i]!=freq2[i]){
            flag=1;
            break;
        }
    }
    if(flag==0){
        return true;
    }
    else{
        return false;
    }
}
