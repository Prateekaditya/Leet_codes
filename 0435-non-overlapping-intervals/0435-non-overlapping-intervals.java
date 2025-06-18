class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        int end=intervals[0][1];
        int n=intervals.length;
        for(int i=1;i<n;i++){
            if(intervals[i][0]<end){
                count ++;
                end=Math.min(intervals[i][1],end);
            }
            else{
                end= intervals[i][1];
            }
        }
        return count;
    }
}