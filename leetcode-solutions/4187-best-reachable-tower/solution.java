class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int cx = center[0];
        int cy = center[1];
        int bestQuality = -1;
        int ansX = -1, ansY = -1;
        for (int[] tower : towers) {
            int x = tower[0];
            int y = tower[1];
            int q = tower[2];
            int dist = Math.abs(x - cx) + Math.abs(y - cy);
            if (dist <= radius) {
                if (q > bestQuality ||
                   (q == bestQuality && 
                   (x < ansX || (x == ansX && y < ansY)))) {
                    bestQuality = q;
                    ansX = x;
                    ansY = y;
                }
            }
        }
        return new int[]{ansX, ansY};
    }
}
