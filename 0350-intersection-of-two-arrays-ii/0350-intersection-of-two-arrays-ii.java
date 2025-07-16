class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num)){
                res.add(num);
                if(map.get(num)==1){
                    map.remove(num);
                }
                else{
                    map.put(num,map.get(num)-1);
                }
            }
        }
        int []ans= new int[res.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}