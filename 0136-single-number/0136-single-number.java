class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int value=0;
        int ans=0;
        for(Integer k:map.keySet()){
            value=map.get(k);
            ans=k;
            if(value==1){
                return k;
            }
        }
        return ans;
    }
}