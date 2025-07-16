class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:nums2){
            if(set.contains(num)){
                res.add(num);
                set.remove(num);
            }
        }
       int []ans = new int[res.size()];
       for(int i=0;i<ans.length;i++){
        ans[i]=res.get(i);
       }
       return ans;
    }
}