class Solution {
    public int pivotIndex(int[] nums) {
      int prefSum=0;
      int total=0;
      for(int ele:nums){
        total+=ele;
      }
      for(int pivot=0;pivot<nums.length;pivot++){
        int suffSum=total-prefSum-nums[pivot];
        if(prefSum==suffSum){
            return pivot;
        }
        prefSum+=nums[pivot];
      }  
      return -1;
    }
}