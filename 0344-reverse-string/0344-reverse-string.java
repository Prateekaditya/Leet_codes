class Solution {
    public void reverseString(char[] s) {
        int n = s.length ;
        int start=0;
        int last=n-1;
        while(start<last){
            char temp;
            temp=s[start];
            s[start]=s[last];
            s[last]=temp;
            start++;
            last--;
        }
    }
}