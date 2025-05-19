class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(Integer k:map.keySet()){
            if(map.get(k)>nums.length/3){
                res.add(k);
            }
        }
        return res;
    }
}