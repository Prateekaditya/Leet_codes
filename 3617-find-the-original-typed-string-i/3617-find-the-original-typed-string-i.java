class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        if(n==0){
            return 0;
        }
        int count=n;
        for(int i=1;i<n;i++){
            if(word.charAt(i)!=word.charAt(i-1)){
                count--;
            }
        }
        return count;
    }
}