class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        for(int idx=0;idx<s.length();idx++){
            if(s.charAt(idx)=='('){
                count++;
            }
            else if(s.charAt(idx)==')'){
                max=Math.max(max,count);
                count--;
            }
        }
        return max;
    }
}
