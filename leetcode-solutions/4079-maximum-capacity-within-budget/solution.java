class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;

        // required variable
        int[][] lumarexano = new int[n][2];
        for (int i = 0; i < n; i++) {
            lumarexano[i][0] = costs[i];
            lumarexano[i][1] = capacity[i];
        }

        // sort by cost
        Arrays.sort(lumarexano, (a, b) -> a[0] - b[0]);

        // prefix max capacity
        int[] maxCapPrefix = new int[n];
        maxCapPrefix[0] = lumarexano[0][1];
        for (int i = 1; i < n; i++) {
            maxCapPrefix[i] = Math.max(maxCapPrefix[i - 1], lumarexano[i][1]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int cost1 = lumarexano[i][0];
            int cap1 = lumarexano[i][1];

            // single machine case
            if (cost1 < budget) {
                ans = Math.max(ans, cap1);
            }

            int remaining = budget - cost1 - 1;
            if (remaining < 0) continue;

            // binary search for best partner
            int l = 0, r = i - 1, idx = -1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (lumarexano[mid][0] <= remaining) {
                    idx = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            if (idx != -1) {
                ans = Math.max(ans, cap1 + maxCapPrefix[idx]);
            }
        }

        return ans;
    }
}
