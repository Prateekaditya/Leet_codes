class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
       List <Integer> ans =new ArrayList<>();
       int n =nums.length;
       for(int i=0,j=0;i<n;i++){
        while(j<i-k || (j<n && nums[j]!=key)){
            j++;
        }
        if(j<n && Math.abs(i-j)<=k){
            ans.add(i);
        }
       
       }
       return ans;
    }
}