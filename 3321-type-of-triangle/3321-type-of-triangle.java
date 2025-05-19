class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(nums[0]+nums[1]<=nums[2]){
            return "none";
        }
        if(set.size()==1){
            return "equilateral";
        }
        else if(set.size()==2){
            return "isosceles";
        }
            return "scalene";
        
    }
}