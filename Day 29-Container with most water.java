class Solution {
    public int maxArea(int[] h) {
       int maxarea=0;
       int left=0;
       int right=h.length-1;
       while(left<right){
        int currentarea=Math.min(h[left],h[right])*(right-left);
        maxarea=Math.max(maxarea,currentarea);
        if(h[left]<h[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return maxarea;
    }
}