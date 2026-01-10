class Solution {
    public int mirrorDistance(int n) {
        int ni=n;
        int reverse=0;
        while(ni!=0){
            int a=ni%10;
            reverse=reverse*10+a;
            ni/=10;
        }
        int ans=Math.abs(reverse-n);
        return ans;
    }
}
