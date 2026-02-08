class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int n = nums.length;
        Stack<Long> s = new Stack<>();
        for (int ele : nums) {
            long cur = ele;
            while (!s.isEmpty() && s.get(s.size() - 1) == cur) {
                //if(!s.isEmpty() && s.get(s.size()-1)==ele){
                cur += s.remove(s.size() - 1);
            }
            s.add(cur);
            // }
        }
        List<Long> res = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            res.add(s.get(i));
        }
        return res;
    }
}