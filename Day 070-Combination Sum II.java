class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,ans,new ArrayList<>());
        
        return ans;
    }
    public void helper(int idx,int[] arr,int t,List<List<Integer>> ans,List<Integer> l){
        
            if(t==0) {ans.add(new ArrayList<>(l));
            return;
            }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>t) break;
            l.add(arr[i]);
            helper(i+1,arr,t-arr[i],ans,l);
            l.remove(l.size()-1);
        }
        
    }
}