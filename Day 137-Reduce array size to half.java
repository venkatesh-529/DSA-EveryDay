class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int ele:arr) m.put(ele,m.getOrDefault(ele,0)+1);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int ele:m.keySet()) pq.add(new int[]{ele,m.get(ele)});
        int k=arr.length/2;
        int c=0;
        while(k>0){
            int a[]=pq.poll();
            k-=a[1];
            c++;
        }
        return c;
    }
}