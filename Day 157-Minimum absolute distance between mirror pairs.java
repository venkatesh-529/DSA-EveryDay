class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int rev=find(ele);
            
            if(m.containsKey(ele)){
              min=Math.min(min,i-m.get(ele));
            }
            m.put(rev,i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public static int find(int x){
        int n=0;
        while(x>0){
            int rem=x%10;
            n=(n*10)+rem;
            x=x/10;
        }
        return n;
    }
}