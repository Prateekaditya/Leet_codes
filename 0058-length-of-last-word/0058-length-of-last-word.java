class Solution {
    public int lengthOfLastWord(String s) {
        int l = 0;
        int n=s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                l++;
            }
            else if (l > 0) {
                break;
            }
        }
        
        return l;
    }
}