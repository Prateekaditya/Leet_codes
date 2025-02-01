class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> s =new Stack<>();
        int [] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && nums[i%n]>=s.peek()){
                s.pop();
            }
            if(!s.isEmpty() && i<n){
                ans[i]=s.peek();
            }
            s.push(nums[i%n]);
        }
        return ans;
    }
}