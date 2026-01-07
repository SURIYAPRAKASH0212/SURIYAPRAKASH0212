class Solution {
    public String reversePrefix(String s, int k) {
        char[] ans=s.toCharArray();
        int start=0;
        int end=k-1;
        while(start<end){
            char temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
        }
        return new String(ans);
    }
}
