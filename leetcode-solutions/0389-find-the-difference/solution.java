class Solution {
    public char findTheDifference(String s, String t) {
        int S=0, T=0;
        for(int i=0;i<s.length();++i){
            S+=(int)s.charAt(i);
        }
        for(int j=0;j<t.length();++j){
            T+=(int)t.charAt(j);
        }
        return (char)(T-S);
    }
}
