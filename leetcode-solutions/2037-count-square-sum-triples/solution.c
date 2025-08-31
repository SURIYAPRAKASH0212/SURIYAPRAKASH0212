int countTriples(int n) {
    int count=0;
    for(int i=1;i<250;i++){
        for(int j=1;j<250;j++){
            int c2=i*i+j*j;
            int c=sqrt(c2);
            if(c<=n&&c*c==c2){
                count++;
            }
            }
        }
    return count;
}
