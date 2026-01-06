class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int jlen=jewels.length();
        int slen=stones.length();
        for(int i=0;i<jlen;i++){
            for(int j=0;j<slen;j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
