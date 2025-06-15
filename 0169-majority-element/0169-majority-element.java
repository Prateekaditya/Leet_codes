class Solution {
    public int majorityElement(int[] nums) {
        int me=0;
        int vote=0;
        for(int i=0;i<nums.length ;i++){
            if(vote==0){
                me=nums[i];
            }
            if(me==nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        }
        return me;
    }
}