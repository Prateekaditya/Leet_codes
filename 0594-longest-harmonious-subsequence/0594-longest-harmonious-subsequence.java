public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
       
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       int maxL=0;
       for(int k : map.keySet()){
        if(map.containsKey(k+1)){
            int cl = map.get(k)+map.get(k+1);
            maxL = Math.max(cl,maxL);
        }
       }
       return maxL;
    }
}