class Solution {
    public int leastInterval(char[] tasks, int n) {
        int p[]=new int[26];
        for(char ch:tasks) p[ch-'A']++;
        int max=0;
        for(int ele:p){
            if(max<ele) max=ele;
        }
        int c=0;
        for(int ele:p){
            if(ele==max)c++;
        }
        return Math.max(tasks.length,(max-1)*(n+1)+c);
    }
}