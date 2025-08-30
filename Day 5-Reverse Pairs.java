class Solution {
    static int c;
    public int reversePairs(int[] nums) {
        c=0;
        mergeSort(nums,0,nums.length-1);
        return c;
    }
    public static void mergeSort(int[] a,int l,int h){
        if(l>=h) return;
        int m=l+(h-l)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        reversePairs(a,l,m,h);
        merge(a,l,m,h);
    }
    public static void reversePairs(int[] a,int l,int m,int h){
        int right=m+1;
        for(int i=l;i<=m;i++){
            while(right<=h && (long)a[i]>2L*a[right]) right++;
            c+=(right-(m+1));
        }
    }
    public static void merge(int[] a,int l,int m,int h){
        List<Integer> lst=new ArrayList<>();
        int left=l,right=m+1;
        while(left<=m&& right<=h){
            if(a[left]<=a[right]){
                lst.add(a[left]);
                left++;
            }
            else{
                lst.add(a[right]);
                right++;
            }
        }
        while(left<=m) lst.add(a[left++]);
        while(right<=h) lst.add(a[right++]);
        int i=l;
        for(int ele:lst)a[i++]=ele;
    }
}