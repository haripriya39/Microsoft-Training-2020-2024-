class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:stones)
            q.offer(i);
        while(q.size()>1)
            q.offer(q.poll()-q.poll());
        return q.poll();
    
    }
}
