class Solution {
    public String makeFancyString(String s) {
        StringBuilder st = new StringBuilder();
        for(char c:s.toCharArray()){
            int len = st.length();
            if(len>=2 && st.charAt(len-1)==c && st.charAt(len-2)==c){
                continue;
            }
            st.append(c);
        }
        return st.toString();
    }
}