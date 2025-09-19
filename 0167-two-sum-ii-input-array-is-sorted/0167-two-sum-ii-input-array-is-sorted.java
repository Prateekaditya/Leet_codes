class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int currSum=numbers[left]+numbers[right];
            if(currSum==target){
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
            else if(currSum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}