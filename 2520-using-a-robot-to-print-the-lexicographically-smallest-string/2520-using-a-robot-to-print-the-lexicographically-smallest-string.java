
class Solution {
    public String robotWithString(String s) {
        int n=s.length();
        char[] minSuffix = new char[n];
        minSuffix[n-1]=s.charAt(n-1);
        for(int i=n-2;i>=0;i--){
            minSuffix[i]=(char) Math.min(s.charAt(i),minSuffix[i+1]);
        }
        StringBuilder res= new StringBuilder();
        Stack<Character> t = new Stack<>();
        int i=0;
         while(i<n || !t.isEmpty()){
            while(!t.isEmpty() && (i>=n || t.peek()<=minSuffix[i])){
                res.append(t.pop());
            }
            if(i<n){
                t.push(s.charAt(i));
                i++;
            }
         }
         return  res.toString(); 
    }
}