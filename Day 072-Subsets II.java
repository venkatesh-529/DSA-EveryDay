class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int idx,int[] nums,List<List<Integer>> ans,List<Integer> cur){
        ans.add(new ArrayList<>(cur));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            cur.add(nums[i]);
            helper(i+1,nums,ans,cur);
            cur.remove(cur.size()-1);
        }
        //helper(idx,nums,ans,cur);
    }
}