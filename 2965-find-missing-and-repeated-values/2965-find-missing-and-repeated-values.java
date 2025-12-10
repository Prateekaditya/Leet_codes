class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int totalElement=n*n;
        long s=(long)totalElement*(totalElement+1)/2;
        long p=(long)totalElement*(totalElement+1)*(2L*totalElement+1)/6;
        long sArr=0;
        long pArr=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sArr+=(long)grid[i][j];
                pArr+=(long)grid[i][j]*grid[i][j];
            }
        }
        long diff1=sArr-s;
        long diff2=pArr-p;
        long sum=diff2/diff1;

        long rep=(sum+diff1)/2;
        long miss=rep-diff1;
        int []ans={(int)rep,(int)miss};
        return ans;
    }
}