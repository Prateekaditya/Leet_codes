class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo=0;
        int hi=arr.length-1;
        int res=k+arr.length;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>k+mid){
                res=mid+k;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return res;
    }
}