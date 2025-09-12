class Solution {
    public boolean doesAliceWin(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
                return true;
            }
        }
        return false;
    }
}