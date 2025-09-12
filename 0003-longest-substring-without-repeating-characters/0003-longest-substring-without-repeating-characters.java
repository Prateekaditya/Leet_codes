class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        int cnt=0;
        int left=0;
        int right=0;
        boolean []vis=new boolean[128];
        while(right<s.length()){
            while(vis[s.charAt(right)]==true){
                vis[s.charAt(left)]=false;
                left++;
            }
            vis[s.charAt(right)]=true;
            cnt=Math.max(cnt,(right-left)+1);
            right++;
        }
        return cnt++;
    }
}