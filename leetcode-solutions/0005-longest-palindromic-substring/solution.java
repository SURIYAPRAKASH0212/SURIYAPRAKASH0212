class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            int len1=right-left-1;
            left=i;
            right=i+1;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            int len2=right-left-1;
            int maxLen=Math.max(len1,len2);
            if(maxLen>end-start){
                start=i-(maxLen-1)/2;
                end=i+maxLen/2;
            }
        }
        return s.substring(start,end+1);
    }
}
