class Solution {
    public boolean isPalindrome(int n) {
        int x=n;
        int ans=0;
        while(n!=0){
            ans*=10;
            ans+=n%10;
            n/=10;
        }
        if(ans==x&&ans>=0){
            return true;
        }
        else{
            return false;
        }
    }
}
