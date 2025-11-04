class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int ans[]=new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            HashMap<Integer,Integer> m=new HashMap<>();
            for(int j=i;j<i+k;j++)m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            List<int[]> f=new ArrayList<>();
            for(int x1:m.keySet()) f.add(new int[]{x1,m.get(x1)});
            f.sort((a,b)-> b[1]!=a[1]?b[1]-a[1]:b[0]-a[0]);
            int sum=0;
            for(int j=0;j<x&&j<f.size();j++) sum+=f.get(j)[1]*f.get(j)[0];
            ans[i]=sum;
        }
        return ans;
    }
}