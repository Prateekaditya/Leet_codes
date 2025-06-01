class Solution {
    public void rev(int arr[],int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void swap(int arr[],int start,int end){ 
            int temp=arr[start];
            arr[start]=arr[end];
           arr[end]=temp;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break ;
            }
        }
        if(pivot==-1){
            rev(nums,0,n-1);
            return ;
        }
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        rev(nums,pivot+1,n-1);
    }
    
}