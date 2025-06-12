class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int [] freq=new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>n){
                freq[n]+=1;
            }
            else{
                freq[citations[i]]+=1;
            }
        }
        int idx=n;
        int count = freq[n];
        while(count<idx){
            idx--;
            count+=freq[idx];
        }
        return idx;
    }
}