class Solution {
    public int minimumDeletions(String word, int k) {
        int []freq = new int[26];
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        List <Integer> frequencies= new ArrayList<>();
        for(int f:freq){
            if(f>0){
                frequencies.add(f);
            }
        }
        int mindel=Integer.MAX_VALUE;
        for(int L:frequencies){
            int del=0;
            for(int currentFreq : frequencies){
                if(currentFreq<L){
                    del+=currentFreq;
                }
                else if(currentFreq>L+k){
                    del += currentFreq -(L+k);
                }
            }
        mindel =Math.min(del,mindel);

        }
        return mindel;
    }
}
