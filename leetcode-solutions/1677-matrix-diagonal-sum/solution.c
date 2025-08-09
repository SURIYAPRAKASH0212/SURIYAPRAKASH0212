int diagonalSum(int** mat, int m, int* n) {
    int sum=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<*n;j++){
            if(i==j){
                sum+=mat[i][j];
            }
        }
    }
    for(int i=0;i<m;i++){
        for(int j=m-1;j>=0;j--){
            if(i+j==*n-1&&i!=j){
                sum+=mat[i][j];
            }
        }
    }
    return sum;
}
