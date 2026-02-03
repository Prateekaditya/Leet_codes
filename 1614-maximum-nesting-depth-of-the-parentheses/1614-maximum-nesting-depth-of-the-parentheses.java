class Solution {
    public int maxDepth(String s) {
       int max=Integer.MIN_VALUE;
       int cnt=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                cnt++;
            }
            else if(ch==')'){
                st.pop();
                cnt--;
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}