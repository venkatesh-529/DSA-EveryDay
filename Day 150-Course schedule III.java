class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int curtot=0;
        for(int ar[]:courses){
            
            if(curtot+ar[0]<=ar[1]){
                pq.add(ar[0]);
                curtot+=ar[0];
            }else if(!pq.isEmpty() && pq.peek()>ar[0]){
                curtot-=pq.poll();
                pq.add(ar[0]);
                curtot+=ar[0];
            }
            
        }
        return pq.size();
    }
}