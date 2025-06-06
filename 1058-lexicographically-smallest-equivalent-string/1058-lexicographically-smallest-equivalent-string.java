
class Solution {
    private int [] parent = new int[26];
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
       for(int i=0;i<26;i++){
        parent[i]=i;
       }
       for(int i=0;i<s1.length();i++){
        union(s1.charAt(i)-'a',s2.charAt(i)-'a');
       }
       StringBuilder res= new StringBuilder();
       for(char c:baseStr.toCharArray()){
        res.append((char)(find(c-'a')+'a'));
       }
       return res.toString();
    }
    private void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        if(rootX!=rootY){
            if(rootX<rootY){
                parent[rootY]=rootX;
            }
            else{
                parent[rootX]=rootY;
            }
        }
    }
    private int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
}