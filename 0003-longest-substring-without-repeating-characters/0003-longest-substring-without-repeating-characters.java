class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        int res=0;
        int left=0;
        int right=0;
        boolean []vis=new boolean[128];
        while(right<s.length()){
            while(vis[s.charAt(right)]==true){
                vis[s.charAt(left)]=false;
                left++;
            }
            vis[s.charAt(right)]=true;
            res=Math.max(res,(right-left+1));
            right++;
        }
        return res;
    }
}