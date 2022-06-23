class RecentCounter {
    
    Queue<Integer> requests = new LinkedList();

    public RecentCounter() {
        requests.clear();
    }
    
    public int ping(int t) {
        requests.offer(t);
        
        while(true) {
            if (requests.peek() >= t-3000 && requests.peek() <= t) {
                break;
            }
            else {
                requests.poll();
            }
            
        }
        
        return requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */