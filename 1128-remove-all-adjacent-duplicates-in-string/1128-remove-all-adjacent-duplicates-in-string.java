class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==0 || s.length()==1){
            return s;
        }
        char []ch=s.toCharArray();
        int top=0;
        for(char c:ch){
            if(top>0 && ch[top-1]==c){
                top--;
            }
            else{
                ch[top]=c;
                top++;
            }
        }
        return new String(ch,0,top);
    }
}