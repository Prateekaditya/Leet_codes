class Solution {
    public int maxProduct(int[] nums) {
        int ltr=1;
        int rtl=1;
        int maxProduct=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(ltr==0){
                ltr=1;
            }
            if(rtl==0){
                rtl=1;
            }
            ltr*=nums[i];
            int j=n-i-1;
            rtl*=nums[j];
            maxProduct = Math.max(ltr,Math.max(rtl,maxProduct));
        }
        return maxProduct;
    }
}