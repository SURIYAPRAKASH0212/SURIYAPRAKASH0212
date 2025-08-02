int heightChecker(int* heights, int heightsSize) {
    int arr[10000000];
    for(int i=0;i<heightsSize;i++){
         arr[i]=heights[i];
    }
    for(int i=0;i<heightsSize;i++){
        for(int j=i+1;j<heightsSize;j++){
            if(heights[i]>heights[j]){
                int temp=heights[j];
                heights[j]=heights[i];
                heights[i]=temp;
            }
        }
    }
    int count=0;
    for(int i=0;i<heightsSize;i++){
        if(heights[i]!=arr[i]){
            count++;
        }
    }
    return count;
}
