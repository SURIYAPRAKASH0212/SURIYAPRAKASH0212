void reverseString(char* s, int sSize) {
    int i=0;
	int j=0;
	int len=sSize-1;
	while(j<len) {
		char temp=s[len];
		s[len]=s[j];
		s[j]=temp;
		len--;
		j++;
	}
}
