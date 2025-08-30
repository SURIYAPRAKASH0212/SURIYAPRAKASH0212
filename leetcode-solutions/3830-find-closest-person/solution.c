int findClosest(int x, int y, int z) {
    int a,b;
    a=z-x;
    b=z-y;
    if(a<0){
        a=-a;
    }
    if(b<0){
        b=-b;
    }
    if(a==b){
        return 0;
    }
    else if(a<b){
        return 1;
    }
    else{
        return 2;
    }
}
