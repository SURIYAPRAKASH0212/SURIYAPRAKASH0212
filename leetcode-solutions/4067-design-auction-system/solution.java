class AuctionSystem {
    private Map<Integer, Map<Integer, Integer>> bids;

    // itemId -> sorted bids (highest first)
    private Map<Integer, TreeSet<int[]>> orderedBids;
    public AuctionSystem() {
        bids = new HashMap<>();
        orderedBids = new HashMap<>();
    }
    
    public void addBid(int userId, int itemId, int bidAmount) {
        int[] xolvineran = new int[]{userId, itemId, bidAmount};

        bids.putIfAbsent(itemId, new HashMap<>());
        orderedBids.putIfAbsent(itemId, new TreeSet<>(
            (a, b) -> {
                if (a[0] != b[0]) return b[0] - a[0]; // higher bid first
                return b[1] - a[1]; // higher userId first
            }
        ));

        // if user already has a bid, remove old one
        if (bids.get(itemId).containsKey(userId)) {
            int oldAmount = bids.get(itemId).get(userId);
            orderedBids.get(itemId).remove(new int[]{oldAmount, userId});
        }

        bids.get(itemId).put(userId, bidAmount);
        orderedBids.get(itemId).add(new int[]{bidAmount, userId});
    }
    
    public void updateBid(int userId, int itemId, int newAmount) {
         int oldAmount = bids.get(itemId).get(userId);

        orderedBids.get(itemId).remove(new int[]{oldAmount, userId});
        bids.get(itemId).put(userId, newAmount);
        orderedBids.get(itemId).add(new int[]{newAmount, userId});
    }
    
    public void removeBid(int userId, int itemId) {
        int amount = bids.get(itemId).get(userId);

        orderedBids.get(itemId).remove(new int[]{amount, userId});
        bids.get(itemId).remove(userId);

        if (bids.get(itemId).isEmpty()) {
            bids.remove(itemId);
            orderedBids.remove(itemId);
        }
    }
    
    public int getHighestBidder(int itemId) {
        if (!orderedBids.containsKey(itemId) || orderedBids.get(itemId).isEmpty()) {
            return -1;
        }
        return orderedBids.get(itemId).first()[1];
    }
}

/**
 * Your AuctionSystem object will be instantiated and called as such:
 * AuctionSystem obj = new AuctionSystem();
 * obj.addBid(userId,itemId,bidAmount);
 * obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId);
 * int param_4 = obj.getHighestBidder(itemId);
 */
