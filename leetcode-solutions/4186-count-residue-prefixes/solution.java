class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen = new boolean[26];
        int distinct = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                distinct++;
            }
            int len = i + 1;
            if (distinct == len % 3) {
                count++;
            }
        }
        return count;  
    }
}
