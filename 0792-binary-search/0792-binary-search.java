class Solution {
    public int search(int[] nums, int target) {
       int start=0;
       int n=nums.length-1;
       int last= n;
       
       while(start<=last){
        int mid = start +(last-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            last=mid-1;
        }
        else{
            start = mid+1;
        }
       }
       return -1;
    }
}