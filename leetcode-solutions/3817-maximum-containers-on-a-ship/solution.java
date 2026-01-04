class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int m=n*n;
        int ans=0;
        if(w>maxWeight&&w>n){
            return 0;
        }
        else{
            for(int i=0;i<m;i++){
                if(maxWeight>=w){
                    maxWeight=maxWeight-w;
                    ans=i;
                }
            }
        }
        return ans+1;
    }
}
