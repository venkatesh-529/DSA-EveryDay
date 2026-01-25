class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> x=new ArrayList<>();
        for(int ele:nums){
            if(ele>=0) x.add(ele);
        }
        List<Integer> r=new ArrayList<>();
        if(x.size()<=0) return nums;
        int s=x.size();
        k=k%x.size();
        r.addAll(x.subList(k,s));
        r.addAll(x.subList(0,k));
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) nums[i]=r.get(idx++);
        }
        return nums;
    }
}