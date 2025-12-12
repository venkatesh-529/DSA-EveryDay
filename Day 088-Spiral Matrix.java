class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int count=0;
        List<Integer> ans=new ArrayList<>();
        int x=matrix.length;
        int y=matrix[0].length;
        int total=x*y;
        System.out.println(x+" "+y);
        int startrow=0;
        int startcol=0;
        int endcol=y-1;
        int endrow=x-1;
        while(count<total){
            for(int i=startcol;i<=endcol && count<total ;i++){
                ans.add(matrix[startrow][i]);
                count++;
            }
            startrow++;
            for(int i=startrow;i<=endrow&& count<total;i++){
                ans.add(matrix[i][endcol]);
                count++;
            }
            endcol--;
            for(int i=endcol;i>=startcol && count<total;i--){
                ans.add(matrix[endrow][i]);
                count++;
            }
            endrow--;
            for(int i=endrow;i>=startrow && count<total;i--){
                ans.add(matrix[i][startcol]);
                count++;
            }
            startcol++;
        }
        return ans;
    }
}