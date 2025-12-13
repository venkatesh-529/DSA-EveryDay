class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=merge(nums1,nums2);
        return median;
    }
    public static double merge(int[] a,int b[]){
        int i = 0, j = 0, k = 0;
        int n1=a.length;
        int n2=b.length;
        int m[]=new int[n1+n2];
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) m[k++] = a[i++];
            else m[k++] = b[j++];
        }
        while (i < n1) m[k++] = a[i++];
        while (j < n2) m[k++] = b[j++];
        int t=n1+n2;
        if(t%2==1) return m[t/2];
        else return (m[t/2-1]+m[t/2])/2.0;
    }
}