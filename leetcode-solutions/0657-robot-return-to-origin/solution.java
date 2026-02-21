class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char move : moves.toCharArray()){
            switch(move){
                case 'U'-> y++;
                case 'D'-> y--;
                case 'L'-> x--;
                case 'R'-> x++;
            }
        }
        return x==0&&y==0;
    }
}
