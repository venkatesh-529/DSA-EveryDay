class Solution {
    public int[] sortByReflection(int[] arr) {
        Integer[] nums=new Integer[arr.length];
        for(int i=0;i<arr.length;i++) nums[i]=arr[i];
        Arrays.sort(nums,(a,b)->{
           int x=Integer.parseInt(new StringBuilder(Integer.toBinaryString(a)).reverse().toString(),2);
            int y=Integer.parseInt(new StringBuilder(Integer.toBinaryString(b)).reverse().toString(),2);
            if(x!=y)
            return Integer.compare(x,y);
            return Integer.compare(a,b);
        });
        for(int i=0;i<arr.length;i++) arr[i]=nums[i];
        return arr;
    }
}