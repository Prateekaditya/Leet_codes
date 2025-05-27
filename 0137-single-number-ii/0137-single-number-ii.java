class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(Integer k:map.keySet()){
            ans=k;
            if(map.get(k)==1){
                return ans;
            }
        }
        return ans;
    }
}